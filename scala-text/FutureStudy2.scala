import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.language.postfixOps

object FutureStudy2 extends App {
  val s = "Hello"
  val f: Future[String] = Future {
    Thread.sleep(1000)
    println(s"[ThreadName] In Future: ${Thread.currentThread.getName}")
    s + " future!"
  }

  f.foreach {
    case s: String =>
      println(s"[ThreadName] In Success: ${Thread.currentThread.getName}")
      println(s)
  }

  println(f.isCompleted)

  Await.ready(f, 3000 millisecond)

  println(s"[ThreadName] In App: ${Thread.currentThread.getName}")
  println(f.isCompleted)
}
