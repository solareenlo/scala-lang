trait TraitA2 {
  def greet(): Unit
}

trait TraitB2 extends TraitA2 {
  override def greet(): Unit = println("Good morning")
}

trait TraitC2 extends TraitA2 {
  override def greet(): Unit = println("Good evening")
}

class ClassA2 extends TraitB2 with TraitC2
class ClassB2 extends TraitC2 with TraitB2

object TraitStudy2 extends App {
  (new ClassA2).greet()
  (new ClassB2).greet()
}

// Good evening
// Good morning
