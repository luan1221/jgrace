package org.luansena;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.luansena.antlr.MIPSLexer;
import org.luansena.antlr.MIPSParser;
import org.luansena.hardware.Memory;
import org.luansena.parser.MIPSVisitor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        String filePath = "/home/luansena/example.asm";

        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            MIPSLexer lexer = new MIPSLexer(CharStreams.fromStream(inputStream));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MIPSParser parser = new MIPSParser(tokens);
            MIPSParser.ProgramContext programContext = parser.program();

            MIPSVisitor visitor = new MIPSVisitor();

            visitor.visit(programContext);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(Memory.values()));
    }
}
