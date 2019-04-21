package com.tank.jvm.classloader;

/**
 * @author tangkun
 * @date 2019-04-20
 */
public class MyTest2 {

    public static void main(String[] args) {
        /*
        1：添加final常量，在(编译期间)就会将常量存入调用常量方法所在类的常量池中，
        调用的类并不会引用定义常量的类，因此不会触发定义常量类的初始化，甚至可以删除class文件类
        ldc 将string 从常量池取出推送至栈顶
        bipush 表示将单字节(-127 至 127)常量池推送栈顶
        iconst_m1、iconst_0、iconst_1 ...  iconst_5 (-1 到 5)表示常量池推送至栈顶
        sipush 表示将短整型推送至栈顶（-32768 , 32767）

         */
        System.out.println(MyParent2.obj);
    }

}

class MyParent2{

    public static final String str = "hello world";
    //使用obj会导致MyParent2被初始化，因为obj编译期无法确定，所以编译期不会放入调用类的常量池
    public static final Object obj = new Object();

    static {
        System.out.println("MyParent2 static block");
    }
}
