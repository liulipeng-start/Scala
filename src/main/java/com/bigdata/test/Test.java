package com.bigdata.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String st = "3";
        System.out.println(st.equals("3"));

        /*自动装箱，和自动拆箱
        自动装箱其实是一种语法糖，可以简单理解为java平台为我们自动进行一些转化，保证不同写法在运行时等价，他们发生在编译阶段，也就是生成的字节码是相同的。
        */
        Integer integer = 1;
        //以上的声明就是用到了自动的装箱：解析为:Integer num = new Integer(9);

        //进行计算时隐含的有自动拆箱
        int unboxing = integer ++;

        List list = new ArrayList();
        list.add(1);
        int i  = (Integer)list.get(0);




    }
}
