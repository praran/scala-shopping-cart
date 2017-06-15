package com.store.shoppingcart

import com.store.shoppingcart.cart.DiscountCalculator
import com.store.shoppingcart.domain.{Apple, Orange, Price, UnknownProduct}
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by praran.
  */
class DiscountCalculatorSpecs extends FlatSpec with Matchers with DiscountCalculator {

  "Discount calculator" should "apply all discounts" in {

    getDiscountedPrice(List(Orange)) should equal(Price(0.25))
    getDiscountedPrice(List(Apple)) should equal(Price(0.60))
    getDiscountedPrice(List(Apple, Apple)) should equal(Price(0.60))
    getDiscountedPrice(List(Apple, Apple, Apple)) should equal(Price(1.20))
    getDiscountedPrice(List(Orange, Orange, Orange)) should equal(Price(0.50))
    getDiscountedPrice(List(Orange, Orange, Orange, Orange)) should equal(Price(0.75))
    getDiscountedPrice(List(Apple, Apple, Orange, Orange, Orange)) should equal(Price(1.10))
    getDiscountedPrice(List(Apple, Apple, Orange, Orange, Orange, UnknownProduct)) should equal(Price(1.10))

  }

}
