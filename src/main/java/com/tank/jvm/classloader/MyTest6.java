package com.tank.jvm.classloader;

/**
 * @author tangkun
 * @date 2019-04-21
 */
public class MyTest6 {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        System.out.println("counter1:"+singleton.counter1);
        System.out.println("counter1:"+singleton.counter2);
    }
}

class Singleton{

    public static  int counter1;

    private static Singleton singleton = new Singleton();

    private Singleton(){
        counter1++;
        counter2++;
    }

    public static  int counter2 = 0;

    public static Singleton getInstance(){
        return singleton;
    }



}
