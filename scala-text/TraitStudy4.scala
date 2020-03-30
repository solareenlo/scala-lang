trait A4 {
  val foo: String
}

trait B4 extends A4 {
  lazy val bar = foo + "World"
}

class C4 extends B4 {
  val foo = "Hello"

  def printBar(): Unit = println(bar)
}

object TraitStudy4 extends App {
  (new C4).printBar()
}

// nullWorld
