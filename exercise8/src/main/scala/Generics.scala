case class Box[A](value: A) {
  def map[B](func: A => B): Box[B] =
    Box(func(value))
}

object Generics {
  def main(args: Array[String]): Unit = {
    println()

    val box1 = Box(123)
    val box2 = Box("abc")

    println(box1.value: Int)
    println(box2.value: String)
    println(box1.map(_ * 1000))

    println()
  }
}
