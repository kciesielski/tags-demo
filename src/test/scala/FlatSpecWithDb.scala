import org.scalatest.{BeforeAndAfterAll, FlatSpec}

class FlatSpecWithDb extends FlatSpec with BeforeAndAfterAll {

  override protected def beforeAll() {
    super.beforeAll()
    println(">>>>>>> STARTING DATABASE!")
  }

  override protected def afterAll() {
    super.beforeAll()
    println(">>>>>>> STOPPING DATABASE!")
  }

}
