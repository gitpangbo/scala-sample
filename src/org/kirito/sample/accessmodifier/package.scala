package org.kirito.sample.accessmodifier

/**
  * Created by pangbo on 2017/2/23.
  */
package p {

  class Super {
    protected def f(): Unit = {
      print("f")
    }
  }

  class Sub extends Super {
    f()
  }

  class Other {
    //(new Super).f() //错误
  }

}

