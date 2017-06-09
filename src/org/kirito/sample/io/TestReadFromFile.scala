package org.kirito.sample.io

import scala.io.Source

/**
  * Created by pangbo on 2017/5/23.
  */
object TestReadFromFile {
  def main(args: Array[String]) {
    println("文件内容为：")

    Source.fromFile("test.txt").foreach(print)
  }
}
