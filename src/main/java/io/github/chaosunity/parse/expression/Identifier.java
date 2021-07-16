package io.github.chaosunity.parse.expression;

import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.util.List;

public record Identifier(String variableName) implements Expression {
    @Override
    public void emit(MethodVisitor methodVisitor, List<String> variables) {
        if (!variables.contains(variableName)) throw new IllegalArgumentException("Variable '" + variableName + "' does not exists.");

        methodVisitor.visitVarInsn(Opcodes.ILOAD, variables.indexOf(variableName));
    }
}
