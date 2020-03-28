object ReturnStudy extends App{
  def indexOf(array: Array[String], target: String): Int = {
    var i: Int = 0
    while(i < array.length) {
      if(array(i) == target) return i
      i += 1
    }
    -1
  }
}
