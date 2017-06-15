package com.store.shoppingcart

import com.store.shoppingcart.catalog._
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by praran.
  */
class ProductCatalogSpecs extends FlatSpec with Matchers {

  "Product catalog" should "contain Apple" in {
    Apple should not be null
    Apple.name should equal("Apple")
    Apple.price should equal(0.60)
  }

  "Product catalog" should "contain Orange" in {
    Apple should not be null
    Apple.name should equal("Orange")
    Apple.price should equal(0.25)
  }

  "Product catalog" should "list all products" in {
    val productsList = ProductCatalog.listProducts
    productsList should not be empty
    productsList should contain (Apple)
    productsList should contain (Orange)
  }
}
