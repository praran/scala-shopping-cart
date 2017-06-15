package com.store.shoppingcart.cart

import com.store.Defaults.addPrices
import com.store.shoppingcart.domain._

/**
  * Created by praran.
  */

/**
  * Calculates the discount based on the prices
  */
trait DiscountCalculator {

  def getDiscountedPrice(items: List[Product]): Price = {
    Offers.list
      .map(_.getDiscountedPrice(items))
      .reduce(addPrices)
  }
}

/**
  * Use the companion object to instantiate the shopping cart
  * @param items
  */
sealed class ShoppingCart(items: List[Product]) extends DiscountCalculator {
  def totalPrice(): Price = getDiscountedPrice(items)
}

/**
  * Companion object for creating shopping cart
  */
object ShoppingCart {
  def apply(items: List[Product]): ShoppingCart = new ShoppingCart(items)
}