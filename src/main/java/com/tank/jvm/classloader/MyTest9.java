package com.tank.jvm.classloader;

/**
 * @author tangkun
 * @date 2019-04-21
 */
public class MyTest9 {

    static {
        System.out.println("MyTest9 static block");

    }
    /**
    加载初始化顺序
    MyTest9-->Parent-->Child
     */
    public static void main(String[] args) {

        System.out.println(Child.b);
    }
}

class Parent{

    static int a  = 3;

    static{
        System.out.println("parent static block");
    }
}

class Child extends Parent{
    static int b  = 3;

    static{
        System.out.println("child static block");
    }

}
