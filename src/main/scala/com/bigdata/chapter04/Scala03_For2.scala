package com.bigdata.chapter04

import scala.collection.immutable
import scala.io.StdIn
import scala.util.control.Breaks._

/*
      *     星号数量 1 行数 1  公式 (n*2)-1 //n是行数
     ***            3      2
    *****           5      3
 */

object Scala03_For2 {
  def main(args: Array[String]): Unit = {
    println("============================")
    println("请输入一个整数")
    val t = StdIn.readInt()
    Pyramid(t)

  }

  def Pyramid(t:Int): Unit ={
    for {i <- Range(1, ((t*2)-1), 2)
         j = (((t*2)-1) - i) / 2} {
      println(" " * j + "*" * i + " " * j)
    }

    for (i <- Range(1, ((t*2)-1), 2) reverse) {
      println(" " * ((((t*2)-1) - i) / 2) + "*" * i + " " * ((((t*2)-1) - i) / 2))
    }

  }
}
