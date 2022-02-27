import scala.io.StdIn

object Todos {
  // Todo list database:
  var items = List("Go shopping", "Do dishes", "Create world peace")

  // Database interface methods:

  def add(item: String): Unit =
    items = items :+ item

  def remove(item: String): Unit =
    items = items.filterNot(_ == item)

  // Console UI:

  def read(prompt: String): String = {
    print(prompt + Console.GREEN + "> " + Console.RESET)
    StdIn.readLine
  }

  def loop(): Unit = {
    read("command") match {
      case "add" =>
        add(read("item"))
        loop()

      case "remove" =>
        remove(read("item"))
        loop()

      case "list" =>
        items.foreach(println)
        loop()

      case "quit" =>
        ()

      case _ =>
        println("Commands: add, remove, list, help, quit")
        loop()
    }
  }

  // Main method:

  def main(args: Array[String]): Unit =
    loop()
}
