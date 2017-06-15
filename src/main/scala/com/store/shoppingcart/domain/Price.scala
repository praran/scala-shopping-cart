package com.store.shoppingcart.domain

/**
  * Created by praran.
  */

/**
  * Price domain object
  * @param amount
  * @param curreny
  */
case class Price(amount: BigDecimal = 0, curreny: String = "£") {
  override def toString: String = s"$curreny $amount"
}
