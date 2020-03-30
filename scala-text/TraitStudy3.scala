trait TraitA3 {
  def greet(): Unit = println("Hello")
}

trait TraitB3 extends TraitA3 {
  override def greet(): Unit = {
    super.greet()
    println("My name is Taro.")
  }
}

trait TraitC3 extends TraitA3 {
  override def greet(): Unit = {
    super.greet()
    println("I like niconico.")
  }
}

class ClassA3 extends TraitB3 with TraitC3
class ClassB3 extends TraitB3 with TraitC3

object TraitStudy3 extends App {
  (new ClassA3).greet()
  (new ClassB3).greet()
}

// My name is Taro.
// I like niconico.
// Hello
// My name is Taro.
// I like niconico.
