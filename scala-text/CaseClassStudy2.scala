sealed abstract class Tree
case class Branch(value: Int, left: Tree, right: Tree) extends Tree
case object Empty extends Tree

object CaseClassStudy2 extends App {
  def max(tree: Tree): Int = tree match {
    case Branch(n, Empty, Empty) => n
    case Branch(n, Empty, r) =>
      val x = max(r)
      if(n > x) n else x
    case Branch(n, l, Empty) =>
      val x = max(l)
      if(n > x) n else x
    case Branch(n, l, r) =>
      val x = max(l)
      val y = max(r)
      if(n > x) {
        if(n > y) n else y
      } else {
        if(x > y) x else y
      }
    case Empty => throw new RuntimeException
  }

  def min(tree: Tree): Int = tree match {
    case Branch(n, Empty, Empty) => n
    case Branch(n, l, Empty) =>
      val x = min(l)
      if(n < x) n else x
    case Branch(n, Empty, r) =>
      val x = min(r)
      if(n < x) n else x
    case Branch(n, l, r) =>
      val x = min(l)
      val y = min(r)
      if(n < x) {
        if(n < y) n else y
      } else {
        if(x < y) x else y
      }
    case Empty => throw new RuntimeException
  }

  def depth(tree: Tree): Int = tree match {
    case Empty => 0
    case Branch(_, l, r) =>
      val lbranch = depth(l)
      val rbranch = depth(r)
      (if(lbranch < rbranch) rbranch else lbranch) + 1
  }

  def toList(tree: Tree): List[Int] = tree match {
    case Empty => Nil
    case Branch(n, l, r) => toList(l) ++ List(n) ++ toList(r)
  }

  val tree: Tree = Branch(1, Branch(2, Empty, Empty), Branch(3, Empty, Branch(4, Empty, Empty)))
  println(max(tree))
  println(min(tree))
  println(depth(tree))
  println(toList(tree))
}
