// You can preview the SVG produced by this class at:
// https://www.svgviewer.dev/

object Svg {
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
}
