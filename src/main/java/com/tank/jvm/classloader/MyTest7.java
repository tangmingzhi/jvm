package com.tank.jvm.classloader;

/**
 * @author tangkun
 * @date 2019-04-21
 */
public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {

        //根类加载
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        //AppClassLoader加载
        Class<?> clazz2 = Class.forName("com.tank.jvm.classloader.C");
        System.out.println(clazz2.getClassLoader());
    }
}

class C{

}
