import scala.io.Source

object FunctionStudy2 extends App {
  def withFile[A](filename: String)(f: Source => A): A = {
    val s = Source.fromFile(filename)
    try {
      f(s)
    } finally {
      s.close()
    }
  }

  def printFile(filename: String): Unit = {
    withFile(filename) { file =>
      file.getLines.foreach(println)
    }
  }

  printFile("test.md")
}
