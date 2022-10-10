import parsing.AST.{FunctionCall, Identifier}
import parsing.parsers.SparkleParser
import munit.Clue.generate
import.scala.util.parsing.combinator.Parsers.
// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {
  test("Testing function calls") {
    val parser = SparkleParser();
    parser.parse(parser.body, "hello()") match {
      case ParserResult.Success(obtained, _) => {
        val expected = List(FunctionCall(Identifier ("hello"), List()));
        assertEquals(obtained, expected)
      }
      case _ => fail("Parser crashed.");
    }
  }
}
