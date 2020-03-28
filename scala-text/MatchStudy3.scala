object MatchStudy3 extends App{
  val obj: Any = List("a")

  // 以下は Scala コンパイラの「型消去」という動作により List[Int] の Int の部分が消されてしまう
  // obj match {
  //   case v: List[Int] => println("List[Int]")
  //   case v: List[String] => println("List[String]")
  // }

  obj match {
    case v: List[_] => println("List[_]")
  }
  // > List[_]
}
