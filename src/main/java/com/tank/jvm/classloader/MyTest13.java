package com.tank.jvm.classloader;

/**
 * @author tangkun
 * @date 2019-04-21
 */
public class MyTest13 {
    public static void main(String[] args) {

        ClassLoader loader = ClassLoader.getSystemClassLoader();
        System.out.println(loader);

        while (null != loader){
            loader = loader.getParent();
            System.out.println(loader);
        }

    }
}


