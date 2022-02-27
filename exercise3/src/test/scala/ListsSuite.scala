class ListsSuite extends munit.FunSuite {
  // test("containsNegatives") {
  //   assertEquals(Lists.containsNegatives(List(1, 2, 3)), false)
  //   assertEquals(Lists.containsNegatives(List(1, 2, -3)), true)
  //   assertEquals(Lists.containsNegatives(List(0)), false)
  //   assertEquals(Lists.containsNegatives(Nil), false)
  // }

  // test("selectDivisibleBy") {
  //   assertEquals(Lists.selectDivisibleBy(List(1, 2, 3, 4), 2), List(2, 4))
  //   assertEquals(Lists.selectDivisibleBy(List(1, 2, 3, 4), 3), List(3))
  //   assertEquals(Lists.selectDivisibleBy(List(1, 2, 3, 4), 0), Nil)
  //   assertEquals(Lists.selectDivisibleBy(Nil, 10), Nil)
  // }

  // test("dividePositivesBy") {
  //   assertEquals(Lists.dividePositivesBy(List(3, 2, 1), 3), List(1, 0, 0))
  //   assertEquals(
  //     Lists.dividePositivesBy(List(-3, -2, -1), 3),
  //     List(-3, -2, -1)
  //   )
  //   assertEquals(Lists.dividePositivesBy(List(5, 0, -5), 2), List(2, 0, -5))
  //   assertEquals(Lists.dividePositivesBy(Nil, 2), Nil)
  // }

  // test("firstLettExercisenly") {
  //   assertEquals(Lists.firstLettersOnly(List("abc", "bcd")), List('a', 'b'))
  //   assertEquals(Lists.firstLettersOnly(List("abc", "")), List('a'))
  //   assertEquals(Lists.firstLettersOnly(Nil), Nil)
  // }

  // test("lastLetteExercisely") {
  //   assertEquals(Lists.lastLettersOnly(List("abc", "bcd")), List('c', 'd'))
  //   assertEquals(Lists.lastLettersOnly(List("abc", "")), List('c'))
  //   assertEquals(Lists.lastLettersOnly(Nil), Nil)
  // }

  // test("sortByLength") {
  //   assertEquals(
  //     Lists.sortByLength(List("aaa", "b", "cc"), true),
  //     List("b", "cc", "aaa")
  //   )
  //   assertEquals(
  //     Lists.sortByLength(List("aaa", "b", "cc"), false),
  //     List("aaa", "cc", "b")
  //   )
  //   assertEquals(Lists.sortByLength(Nil, true), Nil)
  //   assertEquals(Lists.sortByLength(Nil, false), Nil)
  // }

  // test("excelRange") {
  //   assertEquals(excelRange('C', 2), List("A1", "B1", "C1", "A2", "B2", "C2"))
  // }

  // test("charsInSentence") {
  //   assertEquals(
  //     charsInSentence(List("a", "few", "words")),
  //     List('a', 'f', 'e', 'w', 'w', 'o', 'r', 'd', 's')
  //   )
  // }

  // test("palindrome") {
  //   assertEquals(Lists.palindrome(List(1, 2, 3)), List(1, 2, 3, 3, 2, 1))
  //   assertEquals(Lists.palindrome(List("a", "b")), List("a", "b", "b", "a"))
  //   assertEquals(Lists.palindrome(Nil), Nil)
  // }

  // test("fill") {
  //   assertEquals(Lists.fill(3, 1), List(1, 1, 1))
  //   assertEquals(Lists.fill(2, 'x'), List('x', 'x'))
  //   assertEquals(Lists.fill(0, true), Nil)
  // }

  // test("tabulate") {
  //   assertEquals(Lists.tabulate(3, i => 100 * i), List(0, 100, 200))
  //   assertEquals(Lists.tabulate(2, i => s"x$i"), List("x0", "x1"))
  //   assertEquals(
  //     Lists.tabulate(4, i => i % 2 == 0),
  //     List(true, false, true, false)
  //   )
  // }
}
