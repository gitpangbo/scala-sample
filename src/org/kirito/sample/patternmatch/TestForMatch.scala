package org.kirito.sample.patternmatch

/**
  * Scala 模式匹配
  *
  * Scala 提供了强大的模式匹配机制，应用也非常广泛。
  * 一个模式匹配包含了一序列备选项，每个都开始于关键字case。每个预选项都包含了一个模式及一到多个表达式。
  * 箭头符号 => 隔开了模式和表达式。 以下是一个简单的整型值模式匹配实例。
  *
  * Created by pangbo on 2017/5/22.
  */
object TestForMatch {

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def matchTest1(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y:Int => "scala.Int"
    case _ => "many"
  }

  def main(args: Array[String]) {
    println("---------- matchTest  ------------")
    println(matchTest(3))

    println("---------- matchTest1 ------------")
    println(matchTest1("two"))
    println(matchTest1("test"))
    println(matchTest1(1))
    println(matchTest1(6))
  }
}
