package org.kirito.sample.function.callbyname

/**
  * Created by pangbo on 2017/5/18.
  */
object Add {

  def main(args: Array[String]) {
    /**
      * 2 + (2 + 2)
      * 2 + 4
      * 6
      */
    println("addByName: " + addByName(2, 2 + 2))

    /**
      * addByValue(2, 4)
      * 2 + 4
      * 6
      */
    println("addByValue: " + addByValue(2, 2 + 2))
  }

  // 语法上可以看出，使用传名调用时，在参数名称和参数类型中间有一个 => 符号。
  def addByName(a: Int, b: => Int) = a + b

  def addByValue(a: Int, b: Int) = a + b
}

