package com.store.shoppingcart.domain

/**
  * Created by praran.
  */
sealed trait Offer {
  def getDiscountedPrice(items: List[Product]) : Price
}

case object BuyOneGetOneAppleFreeOffer extends Offer {

  override def getDiscountedPrice(items: List[Product]): Price = {
    val apples = items.count(_ == Apple)
    val discountedPrice = ((apples / 2) + (apples % 2)) * Apple.price
    Price(discountedPrice)
  }
}

case object ThreeForThePriceOfTwoOrangesOffer extends Offer {
  override def getDiscountedPrice(items: List[Product]): Price = {
    val oranges = items.count(_ == Orange)
    val discountedPrice = (2 * (oranges / 3) + (oranges % 3)) * Orange.price
    Price(discountedPrice)
  }
}

object Offers {
  def get : List[Offer] = BuyOneGetOneAppleFreeOffer :: ThreeForThePriceOfTwoOrangesOffer :: Nil
}