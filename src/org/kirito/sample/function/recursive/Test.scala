package org.kirito.sample.function.recursive

/**
  * Created by pangbo on 2017/5/18.
  */
object Test {

  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
       n*factorial(n-1)
  }

  def main(args: Array[String]) {
    for (i <- 1 to 10)
      println(i + " 的阶乘为：" + factorial(i))
  }
}
