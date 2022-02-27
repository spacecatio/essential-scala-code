class TodoListSuite extends munit.FunSuite {
  test("list") {
    val todos = new InMemoryTodoList(List("a", "b"))
    assertEquals(todos.list, List("a", "b"))
  }

  test("add") {
    val todos = new InMemoryTodoList(List("a"))
    todos.add("b")
    assertEquals(todos.items, List("a", "b"))
  }

  test("remove") {
    val todos = new InMemoryTodoList(List("a", "b"))
    todos.remove("b")
    assertEquals(todos.items, List("a"))
  }
}
