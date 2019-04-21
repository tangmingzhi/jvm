package com.tank.jvm.classloader;

/**
 * @author tangkun
 * @date 2019-04-20
 */
public class MyTest4 {

    public static void main(String[] args) {

        /*
        1：类型数组并不会导致类的初始化
         2：jvm运行期生成的数组类型，一维数组[L 、二维数组[[L [Lcom.tank.jvm.classloader.MyParent4
         3:anewarray :表示创建一个引用类型数组并压入栈顶
         4： newarray：表示创建一个指定的原始类型 （int float char） 的数组并将其引用值压入栈顶
         */
        MyParent4[] myParent4s = new MyParent4[1];
        System.out.println(myParent4s.getClass());

        int[] ints = new int[1];
        System.out.println(ints.getClass());
    }
}

class MyParent4{

    static {
        System.out.println("static block");
    }
}
