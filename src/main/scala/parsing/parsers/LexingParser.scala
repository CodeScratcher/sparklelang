package parsing.parsers

import scala.util.parsing.combinator.RegexParsers

// TODO: REMEMBER: Tests first!
class LexingParser extends RegexParsers {
  def word: Parser[String] = """[a-zA-Z_\-]+""".r ^^ {
    _.toString
  }

  def number: Parser[Int] = """(0|[1-9]\d*)""".r ^^ {
    _.toInt
  }
  /* def symbol: Parser[String] = """(\+|-|\*|/|==|=|)""".r ^^ {
    case
  } */
}
