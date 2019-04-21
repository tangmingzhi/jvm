package com.tank.jvm.classloader;

/**
 * @author tangkun
 * @date 2019-04-20
 */
public class MyTest1 {

    public static void main(String[] args) {
        /*
         -XX:+TraceClassLoading 追踪类加载
         1:对于静态字段，只有直接定义的类才会被初始化

         -XX: 开头
         +<option> 开启option选项
         -<option> 关闭option选项

         -XX:<option>=<value> 表示option选项值设置为value
         */
        System.out.println(MyChild1.str);
    }

}

class MyParent1 {

    public static final String str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1{
    static {
        System.out.println("MyChild1 static block");
    }
}