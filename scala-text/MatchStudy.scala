object MatchStudy extends App {
  val taro: String = "Taro"
  val sex: String = taro match {
    case "Taro" => "Male"
    case "Jiro" => "Male"
    case "Hanako" => "Female"
  }
  println(taro)
  // > taro
  println(sex)
  // > Male

  val one = 1
  val num: String = one match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }
  println(num)
  // > one

  "abc" match {
    case "abc" => println("first")
    case "def" => println("second")
  }
  // > first

  "abc" match {
    case "abc" | "def" =>
      println("first")
      println("second")
  }
  // > first
  // > second

  val lst = List("A", "B", "C")
  lst match {
    case List("A", b, c) =>
      println("b = " + b)
      println("c = " + c)
    case _ =>
      println("nothing")
  }
  // > b = B
  // > c = C

  val lst2 = List(List("A"), List("B", "C"))
  lst2 match {
    case List(a@List("A"), x) =>
      println(a)
      println(x)
    case _ =>
      println("nothing")
  }
  // > List(A)
  // > List(B, C)

  (List("a"): Any) match {
    case List(_) | Some(_) =>
      println("ok")
  }
  // > ok

  lst match {
    case "A" :: b :: c :: _ =>
      println("b = " + b)
      println("c = " + c)
    case _ =>
      println("nothing")
  }
  // > b = B
  // > c = C

}
