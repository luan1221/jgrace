package org.luansena;

import org.luansena.hardware.RegisterList;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Command(name = "grace", mixinStandardHelpOptions = true, version = "1.0",
        description = "Programa para simular instruções MIPS.")
public class App implements Runnable {

    @Parameters(index = "0", description = "Caminho do arquivo Assembly")
    private String filePath;

    public static Map<Integer, String> programCounter = new HashMap<>();

    public static void main( String[] args ) {
       new CommandLine(new App()).execute(args);
    }

    @Override
    public void run() {
        int pc = 0;
        MIPSimulator simulator = new MIPSimulator();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            Scanner scanner = new Scanner(System.in);
            String line;

            while((line = br.readLine()) != null) {
                System.out.println("Linha do arquivo: " + line);
                programCounter.put(pc, line);
                System.out.print("Pressione Enter para continuar...");
                scanner.nextLine();

                simulator.executeInstruction(line);

            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("Fim do programa.");
        System.out.println(Arrays.toString(RegisterList.values()));
    }

}

