package example

object Hello {
  def main(args: Array[String]): Unit = {
    println(greeting())
  }

  def greeting(): String = "Hello"
}