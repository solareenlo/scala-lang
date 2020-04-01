import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Promise, Future}
import scala.concurrent.duration._
// import scala.util.{Success, Failure}

object PromiseStudy1 extends App {
  val promiseGetInt: Promise[Int] = Promise[Int]
  val futureByPromise: Future[Int] = promiseGetInt.future

  val mappedFuture = futureByPromise.map { i =>
    println(s"Success! i: ${i}")
  }

  Future {
    Thread.sleep(1000)
    promiseGetInt.success(1)
  }

  Await.ready(mappedFuture, 3000.millisecond)
}
