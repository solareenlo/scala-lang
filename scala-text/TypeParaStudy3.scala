class Pair3[+A, +B](val a: A, val b: B) {
  override def toString(): String = "(" + a + "," + b + ")"
}

object TypeParaStudy3 extends App {
  val pair: Pair3[AnyRef, AnyRef] = new Pair3[String, String]("foo", "bar")
  println(pair)
}

// (foo,bar)
