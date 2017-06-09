package org.kirito.sample

/**
  * Scala 类和对象
  *
  * 类是对象的抽象，而对象是类的具体实例。类是抽象的，不占用内存，而对象是具体的，占用存储空间。
  * 类是用于创建对象的蓝图，它是一个定义包括在特定类型的对象中的方法和变量的软件模板。
  *
  * 我们可以使用 new 关键字来创建类的对象，实例如下：
  *
  * Created by pangbo on 2017/5/19.
  */
class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("x 的坐标点： " + x)
    println("y 的坐标点： " + y)
  }
}



object Test {
  def main(args: Array[String]) {
    val pt = new Point(10, 20)
    pt.move(10, 10)
  }
}
