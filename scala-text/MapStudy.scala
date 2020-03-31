object MapStudy extends App {
  def map[T, U](list: List[T])(f: T => U): List[U] = {
    list.foldLeft(Nil: List[U])((x, y) => f(y) :: x).reverse
  }

  println(map(List(1, 2, 3))(x => x * 2))
  println(map(List(1, 2, 3))(x => x).mkString("(", ",", ")"))
}
