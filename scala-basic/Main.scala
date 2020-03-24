object Main extends App {
  println("Hello Wrold!")

  def double(n: Int, f: Int => Int): Int = {
    f(f(n))
  }
}
