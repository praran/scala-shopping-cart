package com.store.shoppingcart

import com.store.shoppingcart.cart.ShoppingCart
import com.store.shoppingcart.domain.{Apple, Orange, Price}
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by praran.
  */
class ShoppingCartSpecs extends FlatSpec with Matchers{

  "Shopping cart" should "accept list of products" in {
     ShoppingCart(List()) should not be null
  }

  "Shopping cart" should "return price as 0 when no items are added" in {
    ShoppingCart(List()).totalPrice() should be(Price(0))
  }

  "Shopping cart" should "return price as 0.60 when it contains one apple" in {
    ShoppingCart(List(Apple)).totalPrice() should be(Price(0.60))
  }

  "Shopping cart" should "return price as 0.25 when it contains one orange" in {
    ShoppingCart(List(Orange)).totalPrice() should be(Price(0.25))
  }

  "Shopping cart" should "return price correct price when it contains more than one item" in {
    ShoppingCart(List(Apple,Apple)).totalPrice() should be(Price(1.20))
    ShoppingCart(List(Orange,Orange)).totalPrice() should be(Price(0.50))
    ShoppingCart(List(Apple,Orange)).totalPrice() should be(Price(0.85))
    ShoppingCart(List(Apple,Orange,Apple)).totalPrice() should be(Price(1.45))
  }

}
