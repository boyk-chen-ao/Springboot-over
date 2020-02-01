package com.mybatis.code.demo.test;

import java.util.ArrayList;

public class SwitchTest {
    public static void main(String[] args) {
        test(4);
        testBetter(9);
    }

    private static void test(int value) {
        switch (value) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("1");
                break;
            case 3:
                System.out.println("1");
                break;
            case 4:
                System.out.println("1");
                break;
            case 5:
                System.out.println("1");
                break;
            case 6:
                System.out.println("0");
                break;
            case 7:
                System.out.println("0");
                break;
            default:
                System.out.println("-1");
        }
    }

    private static void testBetter(int value) {
        switch (value) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("1");
                break;
            case 6: case 7:
                System.out.println("0");
                break;
            default:
                System.out.println("-1");
        }
    }

}
