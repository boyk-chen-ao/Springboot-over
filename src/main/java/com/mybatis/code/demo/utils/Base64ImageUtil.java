package com.mybatis.code.demo.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

/**
 * 将图片转换成Base64编码的字符串,并将字符串再转为图片
 * @Author ：Csa
 * @creatTime ：2020/1/6
 */
public class Base64ImageUtil {
    public static void main(String[] args) throws Exception {
        String strImg = GetImageStr("C:\\Users\\Administrator\\Desktop\\微信图片dwon.jpg");
        System.out.println("==============strImg===============");
        System.out.println(strImg);
        System.out.println("================end================");
        GenerateImage(strImg, "C:/Users/Administrator/Desktop/123.jpg");
    }

    // 图片转化成base64字符串
    public static String GetImageStr(String imgFile) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        InputStream in = null;
        byte[] data = null;
        // 读取图片字节数组
        try {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);// 返回Base64编码过的字节数组字符串
    }

    // base64字符串转化成图片
    public static boolean GenerateImage(String imgStr, String imgFilePath) throws Exception {
        if (imgStr == null) // 图像数据为空
            return false;
        BASE64Decoder decoder = new BASE64Decoder();

        // Base64解码,对字节数组字符串进行Base64解码并生成图片
        byte[] b = decoder.decodeBuffer(imgStr);
        for (int i = 0; i < b.length; ++i) {
            if (b[i] < 0) {// 调整异常数据
                b[i] += 256;
            }
        }
        // 生成jpeg图片
        // String imgFilePath = "c://temp_kjbl_001_ab_010.jpg";//新生成的图片
        OutputStream out = new FileOutputStream(imgFilePath);
        out.write(b);
        out.flush();
        out.close();
        return true;
    }
}
