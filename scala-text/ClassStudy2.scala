class Adder {
  def add(x: Int)(y: Int): Int = x + y
}

object ClassStudy2 extends App {
  val adder = new Adder()
  val fun = adder.add(2) _

  println(fun(10))
  println(adder.add(2)(3))
}
