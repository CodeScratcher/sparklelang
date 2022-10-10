package parsing.AST

case class FunctionCall(call: Identifier, params: List[Expression]) extends Expression {

}
