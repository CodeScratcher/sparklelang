package codeGen

import parsing.AST.Stmt;

trait StmtVisitor {
  def visit(toVisit: Stmt): Unit
}
