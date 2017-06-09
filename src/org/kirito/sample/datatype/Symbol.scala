package org.kirito.sample.datatype

/**
  * Created by pangbo on 2017/3/7.
  */
final case class Symbol private(name: String) {
  override def toString: String = "'" + name
}
