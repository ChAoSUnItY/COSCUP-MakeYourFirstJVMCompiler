package io.github.chaosunity.parse.expression;

import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.util.List;

public record Division(Expression left, Expression right) implements ArithmeticExpression {
    @Override
    public void emit(MethodVisitor methodVisitor, List<String> variables) {
        left.emit(methodVisitor, variables);
        right.emit(methodVisitor, variables);

        methodVisitor.visitInsn(Opcodes.DDIV);
    }
}
