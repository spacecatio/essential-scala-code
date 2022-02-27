final case class Color(r: Double, g: Double, b: Double) {
  def lightness: Double =
    (r + g + b) / 3.0

  def lighten(amount: Double): Color =
    Color(
      (r + amount).min(1.0).max(0.0),
      (g + amount).min(1.0).max(0.0),
      (b + amount).min(1.0).max(0.0)
    )
}

sealed trait Shape {
  def area: Double
  def perimeter: Double

  def color: Color
  def lighten(amount: Double): Shape
}

final case class Rect(width: Double, height: Double, color: Color) extends Shape {
  def area: Double =
    width * height

  def perimeter: Double =
    2 * width + 2 * height

  def lighten(amount: Double): Shape =
    copy(color = color.lighten(amount))
}

final case class Circle(radius: Double, color: Color) extends Shape {
  def area: Double =
    math.Pi * radius * radius

  def perimeter: Double =
    2 * math.Pi * radius

  def lighten(amount: Double): Shape =
    copy(color = color.lighten(amount))
}

object ColorsAndShapes {
  def main(args: Array[String]): Unit = {
    println()

    val yellow = Color(1, 1, 0)
    val pink = Color(1, 0, 1)
    println(yellow)
    println(pink)

    val circle = Circle(50, yellow)
    val rect = Rect(100, 50, pink)
    println(circle)
    println(rect.area)

    println(Svg.shape(circle))
    println(Svg.shape(rect))

    println()
  }
}
