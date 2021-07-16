package io.github.chaosunity.parse.visitor;

import io.github.chaosunity.antlr.COSCUPBaseVisitor;
import io.github.chaosunity.antlr.COSCUPParser;
import io.github.chaosunity.parse.expression.*;
import io.github.chaosunity.parse.expression.Number;

public class ExpressionVisitor extends COSCUPBaseVisitor<Expression> {
    @Override
    public Expression visitExpressions(COSCUPParser.ExpressionsContext ctx) {
        if (ctx.children.size() == 1) {
            if (ctx.number() != null) {
                return visitNumber(ctx.number());
            } else {
                return new Identifier(ctx.getText());
            }
        }

        var left = visitExpressions(ctx.expressions(0));
        var right = visitExpressions(ctx.expressions(1));

        return switch (ctx.getChild(1).getText()) {
            case "+" -> new Addition(left, right);
            case "-" -> new Subtraction(left, right);
            case "*" -> new Multiplication(left, right);
            case "/" -> new Division(left, right);
            default -> throw new IllegalStateException("Unexpected value: " + ctx.getChild(2).getText()); // Should not get to here
        };
    }

    @Override
    public Expression visitNumber(COSCUPParser.NumberContext ctx) {
        return new Number(ctx.getText());
    }
}
