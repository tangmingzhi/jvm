package com.tank.jvm.classloader;

import java.util.Random;

/**
 * @author tangkun
 * @date 2019-04-21
 */
public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}

class FinalTest{

    public static final int  x = new Random().nextInt(3);
    //类发生初始化时会执行static块
    static {
        System.out.println("static block");
    }

}
