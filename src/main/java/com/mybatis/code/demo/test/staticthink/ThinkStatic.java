package com.mybatis.code.demo.test.staticthink;

public class ThinkStatic {

    public static void main(String[] args){
        // Static public static 修饰是静态方法，属于类，使用类名.方法名直接调用
        String haveStatic = Util.HaveStatic();

        String haveStaticStr = Util.urlAll;

        // noStatic public 修饰是非静态方法，该类方法属于对象，在对象初始化（new Object()）后才能被调用；
        Util util = new Util();
        String noStatic = util.NoStatic();

        String noStaticStr = util.urlNoStatic;
    }

}
