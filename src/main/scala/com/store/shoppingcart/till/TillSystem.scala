package com.store.shoppingcart.till

import com.store.Defaults._
import com.store.shoppingcart.cart.ShoppingCart

/**
  * Created by praran.
  */

/**
  * Represents the Till to scan items to the shopping cart
  */
object TillSystem {

  def scanAndCalculateTotalPrice(items: List[String]) = {
    val totalPrice = ShoppingCart(items).totalPrice()
    println(s"Total price is $totalPrice")
    totalPrice
  }

}
