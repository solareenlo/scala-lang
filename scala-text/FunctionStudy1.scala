object FunctionStudy1 extends App {
  def around(init: () => Unit, body: () => Any, fin: () => Unit): Any = {
    init()
    try {
      body()
    } finally {
      fin()
    }
  }

  around(
    () => println("ファイルを開く"),
    () => println("ファイルに対する処理"),
    () => println("ファイルを閉じる")
  )
}
