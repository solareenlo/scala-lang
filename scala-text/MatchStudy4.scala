object MatchStudy4 extends App {
  var list: List[Char] = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
  var count: Int = 0

  // for(i: Int <- 1 to 5) {
  //   if(list.last == list.head) {
  //     println(list)
  //   }
  //   list = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
  // }

  // while(count < 5) {
  //   if(list.head == list.last) {
  //     println(list)
  //     count += 1
  //   }
  //   list = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
  // }

  // for(i: Int <- 1 to 5) {
  //   println(list.init :+ list.head)
  //   list = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
  // }

  for(i <- 1 to 10) {
    val s: String = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList match {
      case List(a, b, c, d, _) => List(a, b, c, d, a).mkString
    }
    println(s)
  }
}
