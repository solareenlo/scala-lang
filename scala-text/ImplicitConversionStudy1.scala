object ImplicitConversionStudy1 extends App {
  implicit class RichString(val src: String) {
    def smile: String = src + ":-)"
  }

  implicit class Bug(val src: String) {
    def one: Int = 1
  }

  println("Hi, ".smile)
  println("Hello".one)
  println("world".one)
  Taps.main(Array())
  println(MapStudy.map(List(1, 2, 3))(x => x * 2))
}
