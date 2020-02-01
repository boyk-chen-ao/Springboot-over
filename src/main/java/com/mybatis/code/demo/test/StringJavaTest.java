package com.mybatis.code.demo.test;

/**
 * java 中String类的常用方法总结，带你玩转String类:
 * https://www.cnblogs.com/aidian/p/8805540.html
 */
public class StringJavaTest {
    public static void main(String[] args) {

        // String.format()----------------------------------------------------------------------------------------------
        String str = "尊敬的%s你好，您有一条待处理事项，请登录智慧园区管理平台—我的工作台，进行处理！";
        String endStr = String.format(str,"陈沈澳");
        System.out.println(endStr);

        String strTrue4 = "尊敬的%s你好，您有一条待处理事项，请登录智慧园区管理平台—我的工作台，进行处理！";
        System.out.println(String.format(strTrue4,"陈沈澳"));

    }
}
