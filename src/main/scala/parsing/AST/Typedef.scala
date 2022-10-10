package parsing.AST

case class Typedef(typeName: Identifier, types: Map[Identifier, List[Typesig]]) extends Stmt {

}
