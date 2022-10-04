package example

import org.scalatest.funsuite._

class HelloSpec extends AnyFunSuite {
  test("Hello.greeting()") {
    assert(Hello.greeting().eq("Hello"))
  }
}