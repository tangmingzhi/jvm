package com.tank.jvm.classloader;

/**
 * @author tangkun
 * @date 2019-04-21
 */
public class MyTest10 {

    static {
        System.out.println("MyTest10 static block");
    }

    public static void main(String[] args) {
        /**
         1:main方法执行，MyTest10会执行初始化，会输出"MyTest10 static block";
         2：parent2定义不会导致初始化;
         3:new Parent2()会导致初始化，会输出"parent2 static block";
         4：parent2.a 会导致类初始化但该类已经初始化，所以不会再输出"parent2 static block";
         5：Child2.b 会导致Child2类初始化，会导致其父类parent2初始化，但parent2已经初始化
         所以不会再输出"parent2 static block",只有child2执行初始化
         */
        Parent2 parent2;
        System.out.println("--------------------");
        parent2 = new Parent2();

        System.out.println(parent2.a);

        System.out.println("------------------------");

        System.out.println(Child2.b);

    }
}

class Parent2{
    static int a = 3;
    static {
        System.out.println("parent2 static block");
    }
}

class Child2 extends Parent2{
    static int b = 4;
    static {
        System.out.println("Child2 static block");
    }
}
