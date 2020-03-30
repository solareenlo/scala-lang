trait A5 {
  val foo: String
}

trait B5 extends A5 {
  // lazy val bar = foo + "World"
  def bar = foo + "World"
}

class C5 extends B5 {
  val foo = "Hello"

  def printBar(): Unit = println(bar)
}

object TraitStudy5 extends App {
  (new C5).printBar()
}

// HelloWorld
