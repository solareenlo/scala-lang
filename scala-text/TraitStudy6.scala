trait A6 {
  val foo: String
}

trait B6 extends A6 {
  val bar = foo + "World"
}

class C6 extends {
  val foo = "Hello"
} with B6 {
  def printBar(): Unit = println(bar)
}

object TraitStudy6 extends App {
  (new C6).printBar()
}

// HelloWorld
