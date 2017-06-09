package org.kirito.sample.accessmodifier

/**
  * Created by pangbo on 2017/2/23.
  */
class Outer {

  class Inner {
    private def f(): Unit = {
      print("f")
    }

    class InnerMost {
      f() // 正确
    }

  }

  //(new Inner).f() //错误

}
