package io.github.chaosunity.parse.statement;

import jdk.internal.org.objectweb.asm.MethodVisitor;

import java.util.List;

public interface Statement {
    void emit(MethodVisitor methodVisitor, List<String> variables);
}
