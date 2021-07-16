package io.github.chaosunity.parse.visitor;

import io.github.chaosunity.antlr.COSCUPBaseVisitor;
import io.github.chaosunity.antlr.COSCUPParser;
import io.github.chaosunity.parse.statement.Statement;

import java.util.List;

public class ContextVisitor extends COSCUPBaseVisitor<List<Statement>> {
    @Override
    public List<Statement> visitContext(COSCUPParser.ContextContext ctx) {
        var statementVisitor = new StatementVisitor();
        return ctx.statements().stream().map(statementVisitor::visitStatements).toList();
    }
}
