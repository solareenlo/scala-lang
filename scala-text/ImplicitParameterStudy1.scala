trait Additive[A] {
  def plus(a: A, b: A): A
  def zero: A
}

case class Point2(x: Int, y: Int)

object ImplicitParameterStudy1 extends App{
  implicit object StringAdditive extends Additive[String] {
    def plus(a: String, b: String): String = a + b
    def zero: String = ""
  }

  implicit object IntAdditive extends Additive[Int] {
    def plus(a: Int, b: Int): Int = a + b
    def zero: Int = 0
  }

  implicit object PointAdditive extends Additive[Point2] {
    def plus(a: Point2, b: Point2): Point2 = Point2(a.x + b.x, a.y + b.y)
    def zero: Point2 = Point2(0, 0)
  }

  def sum[A](list: List[A])(implicit m: Additive[A]) = list.foldLeft(m.zero)((x, y) => m.plus(x, y))

  println(sum(List(1, 2, 3)))
  println(List(1, 2, 3).sum)
  println(sum(List("a", "b", "c")))
  println(sum(List(Point2(1, 1), Point2(2, 2))))
  println(sum(List(Rational(1, 1), Rational(2, 2))))
}
