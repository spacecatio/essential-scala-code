// You can preview the SVG produced by this class at:
//
// https://www.svgviewer.dev/

object Svg {
  def shape(shape: Shape): String =
    shape match {
      case Rect(width, height, color) =>
        rectangle(width, height, hexColor(color))

      case Circle(radius, color) =>
        circle(radius, hexColor(color))
    }

  def circle(radius: Double, color: String): String =
    s"""
    |<svg width="${radius * 2}" height="${radius * 2}">
    |  <circle cx="${radius}" cy="${radius}" r="${radius}" fill="${color}" />
    |</svg>
    """.trim.stripMargin

  def rectangle(width: Double, height: Double, color: String): String =
    s"""
    |<svg width="${width}" height="${height}">
    |  <rectangle width="${width}" height="${height}" fill="${color}" />
    |</svg>
    """.trim.stripMargin

  def hexColor(color: Color): String = {
    def padLeft(str: String, chr: Char, len: Int): String =
      if (str.length == len) str else chr +: str

    def format(value: Double): String =
      padLeft((value * 255).toInt.toHexString, '0', 2)

    s"#${format(color.r)}${format(color.g)}${format(color.b)}"
  }
}
