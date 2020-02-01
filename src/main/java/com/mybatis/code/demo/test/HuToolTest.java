package com.mybatis.code.demo.test;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;

/**
 * HuTool工具类体验
 * @Author: Csa
 * @creattime: 2020/1/9
 */
public class HuToolTest {
    public static void main(String[] args) {

        // 生成二维码----------------------------------------------------------------------------------------------------
        // 生成指定url对应的二维码到文件，宽和高都是300像素
        QrCodeUtil.generate("https://www.baidu.com/?tn=78000241_12_hao_pg",
                300, 300, FileUtil.file("C:\\Users\\Administrator\\Desktop\\二维码.jpg"));

        // 数字转金额----------------------------------------------------------------------------------------------------
        // 1.23456712345612E12 壹万贰仟叁佰肆拾伍亿陆仟柒佰壹拾贰万叁仟肆佰伍拾陆元壹角贰分
        double  a= 1234567123456.12;
        String b = Convert.digitToChinese(a);
        System.out.println("数字:"+ a );
        System.out.println("钞票金额:" +b);

    }
}
