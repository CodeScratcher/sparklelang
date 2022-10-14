import parsing.AST.{FunctionCall, Identifier, Stmt}
import parsing.parsers.SparkleParser
import scala.util.parsing.combinator._
import munit.Clue.generate
// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {
  test("Testing the parsign of function calls") {
    object TestParser extends SparkleParser {
      def main(str: String): Either[List[Stmt], String] = {
        parse(stmt, str) match {
          case Success(obtained, _) => {
            obtained match {
              case Some(x) => Left(List(x))
              case None => Right("Error")
            }
          }
          case _ => Right("Error");
        }
      }
    }
    TestParser.main("hello()") match {
      case Left(obtained) => {
        val expected = List(FunctionCall(Identifier ("hello"), List()));
        assertEquals(obtained, expected)
      }
      case _ => fail("Parser crashed.");
    }
  }
}
