object ListStudy2 extends App {
  def reverse[T](list: List[T]): List[T] = {
    list.foldLeft(Nil: List[T])((x, y) => y :: x)
  }

  val list = List[Int](1, 2, 3)
  println(reverse(list))
  val list2 = List[String]("a", "b", "c")
  println(reverse(list2))
}
