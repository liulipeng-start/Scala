package com.bigdata.chapter02

/**
 * 命名规范
 */

object Scala03_Name {

  def main(args: Array[String]): Unit = {

    // 标识符

    // 首字符为操作符(比如+ - * / )，后续字符也需跟操作符 ,至少一个(反编译)
    // TODO scala中可以使用特殊符号作为标识符,其实是将特殊符号在编译时进行了转换
    val ++ = "123"  //ok
    println(++)

    val +-*/ = 123  //ok
    println(+-*/)

    val %@# = true  //ok
    println(%@#)

    // TODO scala中的下划线_有特殊的用途,不能独立当成变量名来使用
    val _ = "123"     //下划线不能独立当成变量名来使用,不会报错 但输出时会报错
    //println(_)      //单独输出会报错
    val a = "abc" + _
    println(a)  //结果是<function1>


    // TODO 用反引号`....`包括的任意字符串，即使是关键字(39个)也可以 [true]
    val `private` = 123 //ok
    println(`private`)

    //在scala中变量名可以使用int 在Java中是不可以的 (String int = "123" ---->是不允许的)
    var int: String= "123"
    println(int)

  }

}
