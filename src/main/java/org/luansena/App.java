package org.luansena;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.luansena.antlr.MIPSLexer;
import org.luansena.antlr.MIPSParser;
import org.luansena.hardware.Memory;
import org.luansena.parser.MIPSVisitor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class App {

    private static final Semaphore semaphore = new Semaphore(0);

    public static void main( String[] args ) {
        String filePath = "/home/luansena/example.asm";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            Scanner scanner = new Scanner(System.in);
            String line;

            while((line = br.readLine()) != null) {
                System.out.println("Linha do arquivo: " + line);
                System.out.print("Pressione Enter para continuar...");
                scanner.nextLine();

                MIPSLexer lexer = new MIPSLexer(CharStreams.fromString(line));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                MIPSParser parser = new MIPSParser(tokens);
                MIPSParser.ProgramContext programContext = parser.program();

                MIPSVisitor visitor = new MIPSVisitor();

                visitor.visit(programContext);

            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("Fim do programa.");
        System.out.println(Arrays.toString(Memory.values()));
    }
}

