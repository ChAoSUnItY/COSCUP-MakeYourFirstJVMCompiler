package io.github.chaosunity.bytecode;

import io.github.chaosunity.parse.statement.Statement;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.util.List;

public class ClassFactory {
    public static byte[] emit(List<Statement> statements) {
        var classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS);

        classWriter.visit(
                Opcodes.V16,
                Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER,
                "COSCUP",
                null,
                "java/lang/Object",
                null
        );

        {
            var methodVisitor = classWriter.visitMethod(
                    Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
                    "main",
                    "([Ljava/lang/String;)V",
                    null,
                    null
            );

            StatementFactory.emit(methodVisitor, statements);

            methodVisitor.visitMaxs(-1, -1);
            methodVisitor.visitInsn(Opcodes.RETURN);
        }

        return classWriter.toByteArray();
    }
}
