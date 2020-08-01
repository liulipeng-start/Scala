package com.bigdata.test;

/**
 * ++ --
 */

public class Java03_Oper {
    public static void main(String[] args) {
        // 运算
        int i = 0;
        int j = i++; //后++ 是先赋值 先把i的值赋给了j 再做++ j=0,i=1
        int k = ++i;  //前++ 是先加加 然后再赋值 i=2 k =2
        System.out.println("i="+i +" --- " + "j="+j +" --- "+"k="+k);  //i=2 --- j=0 --- k=2


        int a = 0;
        a = a++;
        //运算步骤
        //1. (_c =a++), 2. a = _c
        //3. _c = 0, a = 1 , 4. a = _c =0
        //此过程中_c 是一个临时变量
        System.out.println(a); //结果是0
    }
}
