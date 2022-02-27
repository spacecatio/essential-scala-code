object Lists {
  def containsNegatives(numbers: List[Int]): Boolean =
    numbers.exists(n => n < 0)

  def selectDivisibleBy(numbers: List[Int], den: Int): List[Int] =
    if (den == 0) Nil else numbers.filter(num => num % den == 0)

  def dividePositivesBy(numbers: List[Int], den: Int): List[Int] =
    numbers.map(num => if (num < 0) num else num / den)

  def firstLettersOnly(strings: List[String]): List[Char] =
    strings.filter(str => str.nonEmpty).map(str => str.head)

  def lastLettersOnly(strings: List[String]): List[Char] =
    firstLettersOnly(strings.map(str => str.reverse))

  def sortByLength(strings: List[String], asc: Boolean): List[String] = {
    val comparator: (String, String) => Boolean =
      if (asc) { (x, y) =>
        x.length < y.length
      } else { (x, y) =>
        x.length > y.length
      }

    strings.sortWith(comparator)
  }

  def palindrome[A](list: List[A]): List[A] =
    list ++ list.reverse

  def fill[A](length: Int, item: A): List[A] =
    if (length == 0) Nil else item +: fill(length - 1, item)

  def tabulate[A](length: Int, func: Int => A): List[A] = {
    def loop(num: Int): List[A] =
      if (num < length) func(num) +: loop(num + 1) else Nil

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    println()
    println(containsNegatives(List(1, 2, 3)))
    println(selectDivisibleBy(List(1, 2, 3, 4), 2))
    println(dividePositivesBy(List(3, 4, -3, -4), 3))
    println(firstLettersOnly(List("Hello", "World!")))
    println(lastLettersOnly(List("Hello", "World!")))
    println(sortByLength(List("aaa", "b", "cc"), true))
    println(sortByLength(List("aaa", "b", "cc"), false))
    println(palindrome(List(1, 2, 3)))
    println(fill(3, "x"))
    println(tabulate(3, i => s"x$i"))
    println()
  }
}
