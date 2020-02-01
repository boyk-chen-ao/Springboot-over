package com.mybatis.code.demo.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 对java.util.Date的了解
 */
public class DateJavaTest {
    public static void main(String[] args) {

        // 获得当前时间--------------------------------------------------------------------------------------------------
        Date date=new Date();
        //当前日期的毫秒值
        System.out.println(date.getTime());
        // 获得当前日期的毫秒值
        System.out.println(System.currentTimeMillis());

        // 日期转字符串--------------------------------------------------------------------------------------------------
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss SSS");

        String dateStr=sdf.format(date);

        System.out.println(dateStr);
        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));

        // 字符串转日期--------------------------------------------------------------------------------------------------
        SimpleDateFormat sdf4=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String str="2018/07/12 10:11:12";
        try {
            Date date4=sdf4.parse(str);
            System.out.println("字符串:"+str+"通过yyyy/MM/dd HH:mm:ss格式转换得到"+date4.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
