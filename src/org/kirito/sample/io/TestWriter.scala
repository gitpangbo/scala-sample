package org.kirito.sample.io

import java.io.{File, PrintWriter}


/**
  * Created by pangbo on 2017/5/23.
  */
object TestWriter {
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("./test.txt"))
    writer.write("菜鸟教程xx")
    writer.close()
  }
}
