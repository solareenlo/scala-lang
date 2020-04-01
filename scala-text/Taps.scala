object Taps {
  implicit class Tap[T](self: T) {
    def tap[U](block: T => U): T = {
      block(self)
      self
    }
  }

  def main(args: Array[String]): Unit = {
    "Hello World".tap{s => println(s)}.reverse.tap{s => println(s)}
  }
}
