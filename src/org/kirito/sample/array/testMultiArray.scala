package org.kirito.sample.array

import scala.Array._

/**
  * Created by pangbo on 2017/5/18.
  */
object testMultiArray {
  def main(args: Array[String]) {
    var myMatrix = ofDim[Int](3, 3)

    // 创建矩阵
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j
      }
    }

    // 打印二維阵列
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j))
      }
      println()
    }
  }
}
