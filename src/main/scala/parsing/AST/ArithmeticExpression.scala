package parsing.AST

case class ArithmeticExpression(l: Expression, r: Expression, op: String) extends Expression {

}
