object ColorsAndShapes {

  def main(args: Array[String]): Unit = {
    println()

    println("Using a predefined color:")
    println(Color.yellow)
    println(Color.goldenrod)

    println("Creating color from scratch:")
    println(Color(0.5, 0.75, 0.25))

    println("Creating a color using Color.grey():")
    println(Color.gray(0.333))

    println("Creating colors from other colors:")
    println(Color.limegreen.darker.darker)

    println()
  }
}
