object ForStudy extends App {
  for(x <- 1 to 5; y <- 1 until 5) {
    println("x = " + x + ", y = " + y)
  }

  for(x <- 1 to 5; y <- 1 until 5 if x != y) println((x, y))

  for(e <- List("A", "B", "C", "D", "E")) println(e)

  var test: List[String] = for(e <- List("A", "B", "C", "D", "E")) yield "Pre" + e
  println(test)

  // for(a <- 1 to 100; b <- 1 to 100; c <- 1 to 100 if(a * a == b * b + c * c))
    // println("a = " + a + ", b = " + b + ", c = " + c)
    // println((a, b, c))
}
