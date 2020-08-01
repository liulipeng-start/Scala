package com.bigdata.test;

public class Java01_Hello {
    public static void main(String[] args) {

        System.out.println("Hello World");

        //对于final修饰的局部变量，与未用final修饰的变量一样，都是需要显示初始化。即局部变量都是需要显示初始化的。
        //int a;
        //System.out.println(a);

        String Str = new String("www.runoob.com");
        System.out.println("字符串的哈希码为 :" + Str.hashCode() );

    }

}
