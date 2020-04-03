import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Random, Failure, Success}

object FutureStudy4 extends App {
  val random = new Random()
  val waitMaxMilliSec = 3000

  val futureMilliSec: Future[Int] = Future {
    val waitMilliSec = random.nextInt(waitMaxMilliSec)
    if(waitMilliSec < 1000) throw new RuntimeException(s"watiMilliSec is ${waitMilliSec}")
    Thread.sleep(waitMilliSec)
    waitMilliSec
  }

  val futureSec: Future[Double] = futureMilliSec.flatMap(i => Future {
    Thread.sleep(100)
    i.toDouble / 1000
  })

  futureSec onComplete {
    case Success(waitSec) => println(s"Success! ${waitSec} sec")
    case Failure(t) => println(s"Failure: ${t.getMessage}")
  }

  Thread.sleep(3000)
}
