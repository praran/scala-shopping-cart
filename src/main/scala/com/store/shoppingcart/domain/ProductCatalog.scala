package com.store.shoppingcart.domain

/**
  * Created by praran.
  */

sealed trait Product {
  val price: BigDecimal
  val name: String
  val currency: String
}

case object Apple extends Product {
  override val price: BigDecimal = 0.60
  override val name: String = "Apple"
  override val currency: String = "£"
}

case object Orange extends Product {
  override val price: BigDecimal = 0.25
  override val name: String = "Orange"
  override val currency: String = "£"
}

case object UnknownProduct extends Product {
  override val price: BigDecimal = 0
  override val name: String = "Unknown"
  override val currency: String = ""
}

object ProductCatalog {
  def listProducts = Apple :: Orange :: Nil
}
