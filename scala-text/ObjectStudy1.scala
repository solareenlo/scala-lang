class Person(name: String, age: Int, private val weight: Int) {
  private[this] val num: Int = 10
  private val n: Int = num * 2
}

object Person {
  def printWeight(): Unit = {
    val taro = new Person("Taro", 20, 70)
    println(taro.weight)
    println(taro.n)
  }
}

object ObjectStudy1 extends App {
  Person.printWeight()
}
