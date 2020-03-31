object ListStudy4 extends App {
  def mkString[T](list: List[T])(sep: String): String = list match {
    case Nil => ""
    case first::rest => rest.foldLeft(first.toString)((x, y) => x + sep + y)
  }

  println(mkString(List(1, 2, 3))(","))
  println(mkString(List("a", "b", "c"))(" "))
}
