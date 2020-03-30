trait TraitA {
  def greet(): Unit
}

trait TraitB extends TraitA {
  def greet(): Unit = println("Good morning")
}

trait TraitC extends TraitA {
  def greet(): Unit = println("Good evening")
}

class ClassA extends TraitB with TraitC {
  override def greet(): Unit = println("How are you?")
}

class ClassB extends TraitB with TraitC {
  override def greet(): Unit = super[TraitB].greet()
}

class ClassC extends TraitB with TraitC {
  override def greet(): Unit = {
    super[TraitB].greet()
    super[TraitC].greet()
  }
}

object TraitStudy1 extends App {
  (new ClassA).greet()
  (new ClassB).greet()
  (new ClassC).greet()
}

// Howw are you?
// Good morning
// Good morning
// Good evening
