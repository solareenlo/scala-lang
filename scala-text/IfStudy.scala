object IfStudy extends App{
  var age: Int = 20
  var isSchoolStarted: Boolean = false

  if (age > 0 && age < 7 && !isSchoolStarted)
    println("幼児です")
  else
    println("幼児ではありません")
}
