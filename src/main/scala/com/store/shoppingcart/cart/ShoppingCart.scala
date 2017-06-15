package com.store.shoppingcart.cart

import com.store.shoppingcart.domain.{Price, Product}

/**
  * Created by praran.
  */

class ShoppingCart(items: List[Product]) {

  def totalPrice(): Price = items.foldLeft(Price())(priceCombiner)

  private def priceCombiner(price: Price, product: Product) = Price(amount = price.amount + product.price)

}


object ShoppingCart {
  def apply(items: List[Product]): ShoppingCart = new ShoppingCart(items)
}