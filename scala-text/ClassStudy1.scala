class Point(val x: Int, val y: Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }
  override def toString(): String = "(" + x + ", " + y + ")"
}

object ClassStudy1 extends App {
  val p1 = new Point(1, 1)
  val p2 = new Point(2, 2)

  println(p1 + p2)
}
