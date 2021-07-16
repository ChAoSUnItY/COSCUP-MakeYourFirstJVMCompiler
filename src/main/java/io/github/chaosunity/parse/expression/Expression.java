package io.github.chaosunity.parse.expression;

import jdk.internal.org.objectweb.asm.MethodVisitor;

import java.util.List;

public interface Expression {
    void emit(MethodVisitor methodVisitor, List<String> variables);
}
