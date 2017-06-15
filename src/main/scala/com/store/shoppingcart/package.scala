package com.store

import com.store.shoppingcart.domain.{Price, Product, UnknownProduct}
import com.store.shoppingcart.utils.ProductMapper

/**
  * Created by praran.
  */

/**
  * Package object to hold defaults
  */
package object Defaults {

  /**
    * converts the string to Product
    * @param items
    * @return
    */
  implicit def stringToProduct(items: List[String]): List[Product] = items
    .map(item => ProductMapper.map(item))
    .filter(_ != UnknownProduct)

  /**
    * sum of two prices
    * @param price1
    * @param price2
    * @return
    */
  def addPrices(price1: Price, price2: Price) = Price(amount = price1.amount + price2.amount)

}
