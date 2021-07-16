package io.github.chaosunity.parse.statement;

import io.github.chaosunity.parse.expression.Expression;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.util.List;

public record Assignment(String variableName, Expression expression) implements Statement {
    @Override
    public void emit(MethodVisitor methodVisitor, List<String> variables) {
        expression.emit(methodVisitor, variables);

        if (variables.contains(variableName)) throw new IllegalArgumentException("Variable '" + variableName + "' already exists!");
        variables.add(variableName);

        methodVisitor.visitVarInsn(Opcodes.DSTORE, variables.indexOf(variableName));
    }
}
