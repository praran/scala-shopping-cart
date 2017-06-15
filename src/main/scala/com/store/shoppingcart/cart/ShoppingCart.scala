package com.store.shoppingcart.cart

import com.store.Defaults.addPrices
import com.store.shoppingcart.domain._

/**
  * Created by praran.
  */

trait DiscountCalculator {

  def getDiscountedPrice(items: List[Product]): Price = {
    Offers
      .list
      .map(_.getDiscountedPrice(items))
      .reduce(addPrices)
  }
}

class ShoppingCart(items: List[Product]) extends DiscountCalculator {

  def totalPrice(): Price = getDiscountedPrice(items)

}


object ShoppingCart {
  def apply(items: List[Product]): ShoppingCart = new ShoppingCart(items)
}