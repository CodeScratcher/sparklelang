package parsing.AST

case class Define(name: Identifier, typesig: Typesig, value: Expression) extends Stmt {
  
}
