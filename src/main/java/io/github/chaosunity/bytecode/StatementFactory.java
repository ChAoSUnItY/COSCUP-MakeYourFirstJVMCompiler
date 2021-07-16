package io.github.chaosunity.bytecode;

import io.github.chaosunity.parse.statement.Statement;
import jdk.internal.org.objectweb.asm.MethodVisitor;

import java.util.ArrayList;
import java.util.List;

public class StatementFactory {
    public static void emit(MethodVisitor methodVisitor, List<Statement> statements) {
        var variables = new ArrayList<String>();

        for (var statement : statements)
            statement.emit(methodVisitor, variables);
    }
}
