object Expressions {
  def greeting(name: String): String =
    s"Hello $name!"

  def average(x: Int, y: Int): Int =
    (x + y) / 2

  def isPalindrome(str: String): Boolean =
    str == str.reverse

  def largest(x: Int, y: Int, z: Int): Int =
    if (x > y && x > z) x else if (y > z) y else z

  def factorial(n: Int): Int =
    if (n == 0 || n == 1) 1 else n * factorial(n - 1)

  def leftPad(str: String, len: Int): String =
    if (str.length >= len) str else "0" + leftPad(str, len - 1)

  def isVowel(chr: Char): Boolean =
    chr match {
      case 'a' | 'e' | 'i' | 'o' | 'u' => true
      case 'A' | 'E' | 'I' | 'O' | 'U' => true
      case _                           => false
    }

  def rockPaperScissors(x: String, y: String): Int =
    x match {
      case "rock" =>
        y match {
          case "rock"     => 0
          case "paper"    => -1
          case "scissors" => +1
          case _          => 0
        }

      case "paper" =>
        y match {
          case "rock"     => +1
          case "paper"    => 0
          case "scissors" => -1
          case _          => 0
        }

      case "scissors" =>
        y match {
          case "rock"     => -1
          case "paper"    => +1
          case "scissors" => 0
          case _          => 0
        }

      case _ => 0
    }

  def main(args: Array[String]): Unit = {
    println()
    println(greeting("Earthlings"))
    println(isPalindrome("taco"))
    println(largest(10, 5, 12))
    println(factorial(10))
    println(leftPad("1", 5))
    println(isVowel('e'))
    println(rockPaperScissors("rock", "paper"))
    println()
  }
}
