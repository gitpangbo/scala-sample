package org.kirito.sample.character

/**
  * Created by pangbo on 2017/5/18.
  */
object Test {
  val greeting: String = "Hello, World!"

  def testStringBuilder(): Unit = {
    val buf = new StringBuilder
    buf += 'a'
    buf ++= "bcdef"
    println("buf is : " + buf.toString())
  }

  def main(args: Array[String]) {
    println(greeting)

    testStringBuilder()
  }
}
