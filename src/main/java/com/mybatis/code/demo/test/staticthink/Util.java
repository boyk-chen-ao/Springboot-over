package com.mybatis.code.demo.test.staticthink;

public class Util {

    /**
     * 思考：
     * 带着static关键字的字段，可以在Static方法中用，也可以noStatic的方法中用；
     * 而 没有带static关键字的字符串，只能在非静态（noStatic）方法中使用；
     */
    public static String urlAll = "all";

    public String urlNoStatic = "onlyNoStatic";

    /**
     * Static
     */
    public static String HaveStatic(){
        String s = urlAll;
        return "Static";
    }

    /**
     * noStatic
     */
    public String NoStatic(){
        String s = urlAll;
        String l = urlNoStatic;
        return "noStatic";
    }
}
