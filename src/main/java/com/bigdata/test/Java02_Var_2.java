package com.bigdata.test;

public class Java02_Var_2 {
    public static void main(String[] args) {

        //String, StringBuilder, StringBuffer
        //string 是不可变字符串  StringBuilder, StringBuffer 是可变字符串
        //StringBuilder 的方法不是线程安全的（不能同步访问）
        // 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

        //String 是不可变字符串 其内在含义是它的引用地址不能变 引用存在堆中，
        String name = "zhangsan"; //声明好一个字符串后，它的引用地址不能变
        //string底层源码 private final char[] value;

        //Java中方法的传递是值传递

        //Java中可以单独使用下划线命名变量名 但不推荐
        String _  = "abc";
        System.out.println(_);
    }
}
