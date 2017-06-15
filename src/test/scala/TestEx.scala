import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by praran on 15/06/2017.
  */
class TestEx extends FlatSpec with Matchers{

  "1 + 1" should "result be equal to 2" in {
    (1+1) should be(2)
  }

}
