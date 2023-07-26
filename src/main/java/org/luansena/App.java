package org.luansena;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.luansena.antlr.MIPSLexer;
import org.luansena.antlr.MIPSParser;
import org.luansena.parser.MIPSVisitor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Semaphore;

public class App {

    private static Semaphore semaphore = new Semaphore(0);

    public static void main( String[] args ) {
        String filePath = "/home/luansena/example.asm";

        Thread fileReaderThread = new Thread(() -> {
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("Linha do arquivo: " + line);
                    // Aqui você pode chamar o parser para processar a linha do arquivo
                    // ou fazer qualquer outra ação necessária.
                    MIPSLexer lexer = new MIPSLexer(CharStreams.fromString(line));
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    MIPSParser parser = new MIPSParser(tokens);
                    MIPSParser.ProgramContext programContext = parser.program();

                    MIPSVisitor visitor = new MIPSVisitor();

                    visitor.visit(programContext);

                    try {
                        semaphore.acquire(); // Pausa a leitura do arquivo até que a tecla Enter seja pressionada
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Thread para ler a entrada do teclado
        Thread keyboardInputThread = new Thread(() -> {
            System.out.println("Pressione Enter para continuar...");
            try {
                System.in.read(); // Aguarda a tecla Enter ser pressionada
            } catch (IOException e) {
                e.printStackTrace();
            }
            semaphore.release(); // Libera a leitura do arquivo quando a tecla Enter é pressionada
        });

        fileReaderThread.start();
        keyboardInputThread.start();

        try {
            // Aguarda o término da leitura do arquivo
            fileReaderThread.join();
            // A thread de leitura do teclado não precisa ser aguardada, pois ela termina após pressionar Enter.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fim do programa.");
    }
}
