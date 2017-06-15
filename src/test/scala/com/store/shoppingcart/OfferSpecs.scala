package com.store.shoppingcart

import com.store.shoppingcart.domain._
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by praran.
  */
class OfferSpecs extends FlatSpec with Matchers{

  "Offers " should "contain buy one get one free" in {
    BuyOneGetOneAppleFreeOffer should not be null
  }

  "Offers " should "contain buy three for the price of one" in {
    ThreeForThePriceOfTwoOrangesOffer should not be null
  }

  "Offers list" should "contain all offers" in {
    val offersList : List[Offer] = Offers.get
    offersList should not be empty
    offersList should contain (BuyOneGetOneAppleFreeOffer)
    offersList should contain (ThreeForThePriceOfTwoOrangesOffer)
  }

  "Buy one get one offer" should "be applied when apples are present" in {
    BuyOneGetOneAppleFreeOffer.getDiscountedPrice(List(Apple)) should equal(Price(0.60))
    BuyOneGetOneAppleFreeOffer.getDiscountedPrice(List(Apple, Apple)) should equal(Price(0.60))
    BuyOneGetOneAppleFreeOffer.getDiscountedPrice(List(Apple, Apple, Orange)) should equal(Price(0.60))
  }

  "Buy three for the price of one offer" should "be applied when oranges are present" in {
    ThreeForThePriceOfTwoOrangesOffer.getDiscountedPrice(List(Orange)) should equal(Price(0.25))
    ThreeForThePriceOfTwoOrangesOffer.getDiscountedPrice(List(Orange, Orange)) should equal(Price(0.50))
    ThreeForThePriceOfTwoOrangesOffer.getDiscountedPrice(List(Orange, Orange, Orange)) should equal(Price(0.50))
    ThreeForThePriceOfTwoOrangesOffer.getDiscountedPrice(List(Orange, Orange, Orange, Apple)) should equal(Price(0.50))

  }
}
