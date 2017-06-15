package com.store.shoppingcart

import com.store.shoppingcart.domain.{Apple, Orange, UnknownProduct}
import com.store.shoppingcart.utils.ProductMapper
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by praran.
  */
class ProductMapperSpecs extends FlatSpec with Matchers{

  "Product Mapper" should "return Unknown product when product does not match catalog" in {
     ProductMapper.map("something") should equal(UnknownProduct)
  }

  "Product Mapper" should "return product Apple when string equals apple ignoring case" in {
    ProductMapper.map("Apple") should equal(Apple)
    ProductMapper.map("apple") should equal(Apple)
  }

  "Product Mapper" should "return product Orange when string equals orange ignoring case" in {
    ProductMapper.map("Orange") should equal(Orange)
    ProductMapper.map("orange") should equal(Orange)
  }

}
