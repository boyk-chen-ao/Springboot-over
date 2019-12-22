package com.mybatis.code.demo.utils;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.util.Random;

/**
 * 一般使用的加盐：
 * md5(Password+UserName)，即将用户名和密码字符串相加再MD5，这样的MD5摘要基本上不可反查。
 * 但有时候用户名可能会发生变化，发生变化后密码即不可用了（验证密码实际上就是再次计算摘要的过程）。
 * ----------
 * 因此我们做了一个非常简单的加盐算法，每次保存密码到数据库时，都生成一个随机16位数字，将这16位数字和密码相加再求MD5摘要，然后在摘要中再将这16位数字按规则掺入形成一个48位的字符串。
 * 在验证密码时再从48位字符串中按规则提取16位数字，和用户输入的密码相加再MD5。按照这种方法形成的结果肯定是不可直接反查的，且同一个密码每次保存时形成的摘要也都是不同的。
 * @Author: Csa
 */
public class MD5UtilBetter {
    private static Integer MAX = 16;  //32位随机数

    /**
     * 获取随机盐
     * 盐被称作“Salt值”，这个值是由系统随机生成的，并且只有系统知道。即便两个用户使用了同一个密码，由于系统为它们生成的salt值不同，散列值也是不同的。
     */
    public static String getSalt(){
        StringBuffer buffer = new StringBuffer("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        int range = buffer.length();
        for (int i = 0; i < MAX; i ++) {
            sb.append(buffer.charAt(random.nextInt(range)));
        }
        return sb.toString();
    }

    /**
     * 获取十六进制字符串形式的MD5摘要
     */
    public static String md5Hex(String src) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bs = md5.digest(src.getBytes());
            return new String(new Hex().encode(bs));
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 生成含有随机盐的密码
     */
    public static String generate(String password, String salt) {
        password = md5Hex(password + salt);
        char[] cs = new char[48];
        for (int i = 0; i < 48; i += 3) {
            cs[i] = password.charAt(i / 3 * 2);
            char c = salt.charAt(i / 3);
            cs[i + 1] = c;
            cs[i + 2] = password.charAt(i / 3 * 2 + 1);
        }
        return new String(cs);
    }

    /**
     * 校验密码是否正确
     */
    public static boolean verify(String password, String md5) {
        char[] cs1 = new char[32];
        char[] cs2 = new char[16];
        for (int i = 0; i < 48; i += 3) {
            cs1[i / 3 * 2] = md5.charAt(i);
            cs1[i / 3 * 2 + 1] = md5.charAt(i + 2);
            cs2[i / 3] = md5.charAt(i + 1);
        }
        // 获取md5加盐加密后密码中的盐
        String salt = new String(cs2);
        System.out.println("校验----原来密码获得的md5加密加盐字符串："+md5Hex(password + salt));
        System.out.println("校验----输入密码获得的md5加密加盐字符串："+new String(cs1));
        return md5Hex(password + salt).equals(new String(cs1));
    }

    public static void main(String[] args) {
        String salt = getSalt();
        System.out.println("输出盐："+salt);
        String password = generate("123456", salt);
        System.out.println("输出加盐--并用相应规则转换后的密码："+password);
        System.out.println("输出密码长度："+password.length());
        System.out.println("输出输入密码是否正确:"+verify("123456", password));
    }

}
