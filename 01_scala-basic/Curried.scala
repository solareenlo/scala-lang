object Curried {
  val addCurried = (x: Int) => ((y: Int) => x + y)
  val sum: Int = addCurried(100)(200)
}
