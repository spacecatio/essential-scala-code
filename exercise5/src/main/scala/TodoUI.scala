class TodoUI(database: TodoList) {
  def loop(): Unit = {
    read("command") match {
      case "add" =>
        database.add(read("item"))
        loop()

      case "remove" =>
        database.remove(read("item"))
        loop()

      case "list" =>
        database.list.foreach(println)
        loop()

      case "quit" =>
        ()

      case _ =>
        println("Commands: add, remove, list, help, quit")
        loop()
    }
  }

  def read(prompt: String): String = {
    print(prompt + Console.GREEN + "> " + Console.RESET)
    scala.io.StdIn.readLine
  }
}
