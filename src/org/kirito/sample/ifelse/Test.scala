package org.kirito.sample.ifelse

/**
  * Created by pangbo on 2017/3/7.
  */
object Test {

  def main(args: Array[String]) {
    test1()
    test2()
    test3()
    test4()
  }


  def test1(): Unit = {
    println("--------- test1 ---------")
    var x = 10

    if (x < 20) {
      print("x < 20")
    }
    println()
  }

  def test2(): Unit = {
    println("--------- test2 ---------")
    var x = 30

    if (x < 20) {
      println("x 小于 20")
    } else {
      println("x 大于 20")
    }
    println()
  }

  def test3(): Unit = {
    println("--------- test3 ---------")
    var x = 30

    if (x == 10) {
      println("X 的值为 10")
    } else if (x == 20) {
      println("X 的值为 20")
    } else if (x == 30) {
      println("X 的值为 30")
    } else {
      println("无法判断 X 的值")
    }
    println()
  }

  def test4(): Unit = {
    println("--------- test4 ---------")
    var x = 30
    var y = 10

    if (x == 30) {
      if (y == 10) {
        println("X = 30 , Y = 10")
      }
    }
    println()
  }
}
