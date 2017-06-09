package org.kirito.sample

/**
  * Scala Trait(特征)
  * Scala Trait（特征）相当于Java的接口，实际上他比接口还功能强大。
  * 与接口不同的是，它还可以定于属性和方法的实现。
  * 一般情况下Scala的类只能够继承单一父类，但是如果是Trait（特征）的话就可以继承多个，从结果来看就是实现了多重继承。
  * Trait（特征）定义的方式与类类似，但它使用的关键字是trait，如下所示：
  *
  * Created by pangbo on 2017/5/22.
  */

trait Equal {
  def isEqual(x: Any): Boolean

  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class PointForEqual(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc

  override def isEqual(obj: Any): Boolean = {
    obj.isInstanceOf[PointForEqual] && obj.asInstanceOf[PointForEqual].x == x
  }
}

object TestForEqual {
  def main(args: Array[String]) {
    val p1 = new PointForEqual(2, 3)
    val p2 = new PointForEqual(2, 4)
    val p3 = new PointForEqual(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))
  }
}
