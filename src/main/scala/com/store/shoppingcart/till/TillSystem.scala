package com.store.shoppingcart.till

import com.store.Defaults._
import com.store.shoppingcart.cart.ShoppingCart

/**
  * Created by praran.
  */
object TillSystem {

  def scanAndCalculateTotalPrice(items: List[String]) = {
    val totalPrice = ShoppingCart(items).totalPrice()
    println(s"Total price is ${totalPrice.curreny} ${totalPrice.amount}")
    totalPrice
  }

}
