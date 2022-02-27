object Functions {
  def isVowel(chr: Char): Boolean =
    chr match {
      case 'a' | 'e' | 'i' | 'o' | 'u' => true
      case 'A' | 'E' | 'I' | 'O' | 'U' => true
      case _                           => false
    }

  def containsVowel(str: String): Boolean =
    str.exists(isVowel)

  def containsUpperCase(str: String): Boolean =
    str.exists(chr => chr.isUpper)

  def redact(str: String, chr: Char): String =
    str.filter(c => c != chr)

  def leetspeek(str: String): String =
    str.map(chr =>
      chr match {
        case 'a' | 'A' => '4'
        case 'e' | 'E' => '3'
        case 'i' | 'I' => '1'
        case 'o' | 'O' => '0'
        case 't' | 'T' => '7'
        case other     => other.toUpper
      }
    )

  def shiftChar(n: Int)(chr: Char): Char =
    if (chr.isLower) {
      ('a'.toInt + (chr.toInt - 'a'.toInt + n) % 26).toChar
    } else if (chr.isUpper) {
      ('A'.toInt + (chr.toInt - 'A'.toInt + n) % 26).toChar
    } else {
      chr
    }

  def rot13(str: String): String =
    str.map(shiftChar(13))

  def shift(str: String, n: Int): String =
    str.map(shiftChar(n))

  def main(args: Array[String]): Unit = {
    println()
    println(containsVowel("text"))
    println(containsUpperCase("TXT"))
    println(leetspeek("Hello Javascript!"))
    println(rot13("Hello World!"))
    println(shift("Hello World!", 1))
    println()
  }
}
