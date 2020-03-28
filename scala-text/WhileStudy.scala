object WhileStudy extends App {
  def loopFrom0To9(): Unit = {
    var i: Int = 0
    do {
      println("i = " + i)
      i = i + 1
    } while(i < 10)
  }

  loopFrom0To9()
}
