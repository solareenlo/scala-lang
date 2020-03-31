object ListStudy3 extends App {
  def sum(list: List[Int]): Int = list.foldRight(0){ (y, x) => y + x }
  def mul(list: List[Int]): Int = list.foldRight(1)((x, y) => x * y)

  val list = List[Int](1, 2, 3)
  println(sum(list))
  println(sum(Nil))
  println(mul(List(1, 2, 3, 4)))
}
