package com.store.shoppingcart.cart

import com.store.shoppingcart.domain.Product

/**
  * Created by praran.
  */
class ShoppingCart(items : List[Product]) {
  def totalPrice() : BigDecimal = items.map(_.price).sum

}


object ShoppingCart {
  def apply(items: List[Product]): ShoppingCart = new ShoppingCart(items)
}