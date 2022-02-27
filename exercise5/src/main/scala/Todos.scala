object Todos {
  // val list = new InMemoryTodoList(
  //   List("Go shopping", "Do dishes", "Create world peace")
  // )

  val list = new FileBasedTodoList(new java.io.File("todos.txt"))

  val ui = new TodoUI(list)

  def main(args: Array[String]): Unit =
    ui.loop
}
