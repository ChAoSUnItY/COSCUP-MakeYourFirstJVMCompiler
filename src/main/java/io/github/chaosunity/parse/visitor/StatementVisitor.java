package io.github.chaosunity.parse.visitor;

import io.github.chaosunity.antlr.COSCUPBaseVisitor;
import io.github.chaosunity.antlr.COSCUPParser;
import io.github.chaosunity.parse.statement.Assignment;
import io.github.chaosunity.parse.statement.Statement;

public class StatementVisitor extends COSCUPBaseVisitor<Statement> {
    @Override
    public Statement visitAssignment(COSCUPParser.AssignmentContext ctx) {
        return new Assignment(ctx.ID().getText(), new ExpressionVisitor().visitExpressions(ctx.expressions()));
    }
}
