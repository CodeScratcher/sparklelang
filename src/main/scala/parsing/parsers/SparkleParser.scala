package parsing.parsers

import scala.util.parsing.combinator.*;
import parsing.AST.*;

class SparkleParser extends Parsers {
  def body: Parser[List[Stmt]] = List();
}
