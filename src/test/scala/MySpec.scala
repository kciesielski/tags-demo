import org.scalatest.{FlatSpec, Matchers}
import tags.RequiresDb

@RequiresDb
class MySpec extends FlatSpecWithDb with Matchers {

  it should "comapre 1 with 1" in {
    1 should be (1)
  }

  it should "fail" in {
    fail("Aaargh!")
  }

}

class MySpecAlwaysExecuted extends FlatSpec with Matchers {

  it should "always run" in {
    1 should be (1)
  }
}