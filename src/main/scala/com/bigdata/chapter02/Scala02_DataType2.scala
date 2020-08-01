package com.bigdata.chapter02

/**
 * 数据类型
 */

object Scala02_DataType2 {

  def main(args: Array[String]): Unit = {

    // TODO byte，short，char  他们三者可以计算，在计算时首先转换为int类型。
    var s: Short = 5 // ok
    //s = s-2    //  error  Int -> Short

    var b: Byte = 3 // ok
    //b = b + 4              // error Int ->Byte
    //b = (b + 4).toByte // ok ，使用强制转换

    //var c: Char = 'a' // ok
    //var i: Int = 5 // ok
    //var d: Float = .314F // ok
    // TODO 自动提升原则： 表达式结果的类型自动提升为 操作数中最大的类型
    //var result: Double = c + i + d //ok Float->Double


    var b1: Byte = 5 // ok
    var s1: Short = 3 // ok
    //var t : Short = s + b // error Int->Short
    var t2 = s + b   // ok, 使用类型推导
    println(t2)


    // TODO 字符串类型
    var st : String = "123"
    println(st.toInt)

    // 但不能把"abc"转成数字，会报错 NumberFormatException


    var st1: String = "12.5"
    //"12.5" 如果转成int 也是不可以的 因为Int中没有小数点
    //println(st1.toInt)
    println(st1.toDouble) //toDouble是可以的




  }
}
