package com.tank.jvm.classloader;

/**
 * @author tangkun
 * @date 2019-04-21
 */
public class MyTest12 {
    public static void main(String[] args) throws ClassNotFoundException {

        //ClassLoader 加载类并不属于主动使用，不会导致类的初始化
        ClassLoader loader = ClassLoader.getSystemClassLoader();

        Class<?> clazz = loader.loadClass("com.tank.jvm.classloader.CL");
        System.out.println(clazz);

        System.out.println("====================");

        clazz = Class.forName("com.tank.jvm.classloader.CL");
        System.out.println(clazz);
    }
}

class CL{
    static
    {
        System.out.println("CL static block");
    }
}
