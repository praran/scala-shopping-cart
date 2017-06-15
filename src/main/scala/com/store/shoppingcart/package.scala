package com.store

import com.store.shoppingcart.domain.{Price, Product, UnknownProduct}
import com.store.shoppingcart.utils.ProductMapper

/**
  * Created by praran.
  */
package object Defaults {

  implicit def stringToProduct(items: List[String]): List[Product] = items
    .map(item => ProductMapper.map(item))
    .filter(_ != UnknownProduct)

  def addPrices(price1: Price, price2: Price) = Price(amount = price1.amount + price2.amount)

}
