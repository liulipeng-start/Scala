package com.bigdata.chapter02

/**
 * 变量
 */

object Scala01_Var {

  // TODO 在方法的外部声明的变量如果采用val关键字,等同于使用final修饰；以后不允许更改；
  val sex: String = "男"

  def main(args: Array[String]): Unit = {

    //java局部变量
    //变量类型 变量名称 = 变量的值
    //int i = 10;

    //scala 中声明变量
    // TODO var 变量名称 : 变量类型 = 变量的值
    //var name: String = "张三"

    // TODO scala声明变量必须显式的初始化 var name: String = "张三"
    /*var name: String
    name = "zhangsan"*/ // TODO 这种语法在scala中是不支持的

    // TODO 使用 var声明的变量的值是可以修改的
    var age: Int = 10
    age = 20

    var c: Char = 'C'

    var b: Boolean = true

    // TODO 使用val声明的变量的值无法修改
    val name1: String = "张三"
    //name1 = "lisi"

  }

}
