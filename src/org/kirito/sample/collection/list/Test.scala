package org.kirito.sample.collection.list

/**
  * Created by pangbo on 2017/5/19.
  */
object Test {

  // 字符串列表
  val site: List[String] = List("Runoob", "Google", "Baidu")

  // 整形列表
  val nums: List[Int] = List(1, 2, 3, 4)

  // 空列表
  val empty: List[Nothing] = List()

  // 二维列表
  val dim: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )

  def main(args: Array[String]) {
    println("first website is : " + site.head)
    println("last website is : " + site.tail)
    println("check list site is null : " + site.isEmpty)
    println("check list empty is null : " + empty.isEmpty)
  }
}
