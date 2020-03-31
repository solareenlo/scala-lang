object CountStudy extends App {
  def count[T](list: List[T])(f: T => Boolean): Int = {
    list.foldLeft(0)((x , y) => if(f(y)) x + 1 else x)
  }

  println(count(List(1, 2, 3, 4, 5))(x => x % 2 == 1))
}
