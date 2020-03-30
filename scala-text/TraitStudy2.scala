trait TraitA2 {
  def greet(): Unit
}

trait TraitB2 extends TraitA2 {
  override def greet(): Unit = println("Good morning")
}

trait TraitC3 extends TraitA2 {
  override def greet(): Unit = println("Good evening")
}

class ClassA3 extends TraitB2 with TraitC3
class ClassB3 extends TraitC3 with TraitB2

object TraitStudy2 extends App {
  (new ClassA3).greet()
  (new ClassB3).greet()
}

// Good evening
// Good morning
