package com.store

import com.store.shoppingcart.domain.{Product, UnknownProduct}
import com.store.shoppingcart.utils.ProductMapper

/**
  * Created by praran.
  */
package object Defaults {

  implicit def stringToProduct(items: List[String]): List[Product] = items
    .map(item => ProductMapper.map(item))
    .filter(_ != UnknownProduct)
}
