object ArrayStudy extends App {
  def swapArray[T] (arr: Array[T])(i: Int, j: Int): Unit = {
    val tmp: T = arr(i)
    arr(i) = arr(j)
    arr(j) = tmp
  }

  var arr = Array(1, 2, 3)
  swapArray(arr)(0, 2)
  println(arr.length)
  println(arr.toList)
}

