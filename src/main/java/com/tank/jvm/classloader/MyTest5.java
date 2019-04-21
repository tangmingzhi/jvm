package com.tank.jvm.classloader;

/**
 * @author tangkun
 * @date 2019-04-21
 */
public class MyTest5 {

    public static void main(String[] args) {
        //System.out.println(MyChildCla5.b);
        System.out.println(MyParent5_1.t);
    }
}

interface MyParent5{
    public static  int a = 5;

    /**
    {}为实例块，当对象被创建的时候{}执行一次
     */
    public static final Thread t = new Thread(){
        {
            System.out.println("MyParent5 invoked");
        }
    };
}

interface MyChild5 extends MyParent5{

    public static final int b = 6;
}

class MyChildCla5 implements MyParent5{
    public static  int b = 6;
}

interface MyGrandpa5_1{
    /**
     {}为实例块，当对象被创建的时候{}执行一次
     */
    public static final Thread t = new Thread(){
        {
            System.out.println("MyParent5 invoked");
        }
    };
}

interface MyParent5_1{
    /**
     {}为实例块，当对象被创建的时候{}执行一次
     */
    public static final Thread t = new Thread(){
        {
            System.out.println("MyParent5 invoked");
        }
    };
}
