object TypeParaStudy2 extends App {
  val m = 7
  val n = 3

  println(new Tuple2(m / n, m % n))
  println((m / n, m * n))
  println((m / n, m % n, m * n, m - n))
}
