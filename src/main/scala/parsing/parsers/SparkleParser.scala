package parsing.parsers

import scala.util.parsing.combinator.*;
import parsing.AST.*;

class SparkleParser extends RegexParsers {
  def stmt: Parser[Option[Stmt]] = Parser(x => {
    x.drop(1);
    Success(None, x)
  });
}
