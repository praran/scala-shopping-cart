package com.store.shoppingcart.utils

import com.store.shoppingcart.domain.{Apple, Orange, Product, UnknownProduct}

/**
  * Created by praran.
  */

/**
  * Convert string to product
  */
object ProductMapper {

  def map(item: String): Product = item match {
    case str if str.equalsIgnoreCase("apple") => Apple
    case str if str.equalsIgnoreCase("orange") => Orange
    case _ => UnknownProduct
  }
}
