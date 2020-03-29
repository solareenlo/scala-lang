class Adder3 {
  def add(x: Int, y: Int): Int = x + y
}

object ClassStudy3 extends App {
  val adder = new Adder3
  println(adder.add(2, 3))

  val fun: Int => Int = adder.add(2, _)
  println(fun(10))
}
