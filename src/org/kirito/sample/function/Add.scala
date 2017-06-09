package org.kirito.sample.function

/**
  * Created by pangbo on 2017/5/18.
  */
object Add {

  def main(args: Array[String]) {
    println("Returned value: " + addInt(5, 7))
  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }
}
