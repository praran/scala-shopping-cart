package com.store.shoppingcart

import com.store.shoppingcart.domain.Price
import com.store.shoppingcart.till.TillSystem
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by praran.
  */
class TillSystemSpecs extends FlatSpec with Matchers{

  "Till system scan" should "accept list of items" in {
    TillSystem.scanAndCalculateTotalPrice(List()) should not be null
  }

  "Till system scan" should "return 0 price when empty list is sent" in {
    TillSystem.scanAndCalculateTotalPrice(List()) should  equal(Price(0))
  }

  "Till system scan" should "be able to create shopping cart and return total price when correct product is sent" in {
    TillSystem.scanAndCalculateTotalPrice(List("Apple")) should equal(Price(0.60))
  }

  "Till system scan" should "be able to create shopping cart and return total price for all valid products" in {
    TillSystem.scanAndCalculateTotalPrice(List("Apple", "orange")) should equal(Price(0.85))
  }

  "Till system scan" should "be able to create shopping cart and return total price for all valid products ignoring invalid products" in {
    TillSystem.scanAndCalculateTotalPrice(List("Apple", "orange", "something")) should equal(Price(0.85))
  }
}
