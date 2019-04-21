package com.tank.jvm.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author tangkun
 * @date 2019-04-21
 */
public class MyTest14 {

    public static void main(String[] args) throws IOException {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        System.out.println(classLoader);

        String resourceName = "com/tank/jvm/classloader/MyTest13.class";

        Enumeration<URL> urls = classLoader.getResources(resourceName);

        while (urls.hasMoreElements()){
            URL url = urls.nextElement();
            System.out.println(url);
        }

        System.out.println("系统加载器"+MyTest14.class.getClassLoader());
        System.out.println("bootstrap 加载器："+String.class.getClassLoader());
    }
}
