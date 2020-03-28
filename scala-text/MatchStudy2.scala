import java.util.Locale

object MatchStudy2 extends App {
  val obj: AnyRef = "String Literal"

  obj match {
    case v:java.lang.Integer =>
      println("Integer")
    case v:String =>
      println(v.toUpperCase(Locale.ENGLISH))
  }
}
