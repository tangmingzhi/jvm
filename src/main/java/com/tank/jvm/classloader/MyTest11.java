package com.tank.jvm.classloader;

/**
 * @author tangkun
 * @date 2019-04-21
 */
public class MyTest11 {

    public static void main(String[] args) {

        //a定义在父类，所以并未对其主动使用
        System.out.println(Child3.a);

        System.out.println("-------------");
        //doSomething方法定义在父类，所以并未对其主动使用，父类已经被初始化过，所以不会再次初始化
        Child3.doSomething();
    }
}

class Parent3{
    static int a = 3;
    static {
        System.out.println("Parent3 static block");
    }

    static void doSomething(){
        System.out.println("do something");
    }
}

class Child3 extends Parent3{
    static {
        System.out.println("Child3 static block");
    }
}
