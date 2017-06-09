package org.kirito.sample.loop

/**
  * Created by pangbo on 2017/3/7.
  */
object Test {

  def main(args: Array[String]) {
    //test1()
    test2()
  }

  def test1(): Unit = {
    var a = 10;
    // 无限循环
    while (true) {
      println("a 的值为 : " + a);
    }
  }

  def test2(): Unit = {
    var a = 0;
    val numList = List(1, 2, 3, 4, 5, 6);

    // for 循环
    for (a <- numList) {
      println("Value of a: " + a);
    }
  }

}
