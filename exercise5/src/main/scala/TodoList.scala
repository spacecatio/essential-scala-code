import java.io.{File, PrintWriter}
import scala.io.Source

trait TodoList {
  def list(): List[String]
  def add(item: String): Unit
  def remove(item: String): Unit
}

class InMemoryTodoList(var items: List[String]) extends TodoList {
  def list(): List[String] =
    items

  def add(item: String): Unit =
    items = items :+ item

  def remove(item: String): Unit =
    items = items.filterNot(_ == item)
}

class FileBasedTodoList(file: File) extends TodoList {
  def list(): List[String] =
    load()

  def add(item: String): Unit =
    save(load() :+ item)

  def remove(item: String): Unit =
    save(load().filterNot(_ == item))

  private def load(): List[String] =
    try {
      Source.fromFile(file).getLines().toList
    } catch {
      case exn: Exception =>
        Nil
    }

  private def save(items: List[String]): Unit = {
    val writer = new PrintWriter(file)
    try {
      items.foreach(writer.println)
    } finally {
      writer.close()
    }
  }
}
