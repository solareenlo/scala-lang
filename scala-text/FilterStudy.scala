object FilterStudy extends App {
  def filter[T](list: List[T])(f: T => Boolean): List[T] = {
    list.foldLeft(Nil: List[T])((x, y) => if(f(y)) y::x else x).reverse
  }

  println(filter(List(1, 2, 3, 4, 5))(x => x % 2 == 1))
}
