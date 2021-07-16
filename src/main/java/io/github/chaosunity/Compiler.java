package io.github.chaosunity;

import io.github.chaosunity.antlr.COSCUPLexer;
import io.github.chaosunity.antlr.COSCUPParser;
import io.github.chaosunity.bytecode.ClassFactory;
import io.github.chaosunity.parse.visitor.ContextVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Compiler {
    public static void main(String[] args) {
        try {
            var input = new ANTLRInputStream(new FileInputStream("example/test.coscup"));
            var lexer = new COSCUPLexer(input);
            var parser = new COSCUPParser(new CommonTokenStream(lexer));
            var tree = parser.context();
            var statementVisitor = new ContextVisitor();
            var statements = statementVisitor.visitContext(tree);

            System.out.println(statements);

            var bytecode = ClassFactory.emit(statements);
            var file = new File("example/COSCUP.class");

            file.getParentFile().mkdirs();
            file.createNewFile();

            try (var fs = new FileOutputStream(file)) {
                fs.write(bytecode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
