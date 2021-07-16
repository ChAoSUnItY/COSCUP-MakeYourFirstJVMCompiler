package io.github.chaosunity.parse.expression;

import jdk.internal.org.objectweb.asm.MethodVisitor;

import java.util.List;

public record Number(String number) implements Expression {
    @Override
    public void emit(MethodVisitor methodVisitor, List<String> variables) {
        methodVisitor.visitLdcInsn(Double.valueOf(number));
    }
}
