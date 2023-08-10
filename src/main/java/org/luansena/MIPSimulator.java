package org.luansena;

import java.util.HashMap;
import java.util.Map;

public class MIPSimulator {
    private int[] registers = new int[32]; // Registradores MIPS
    private int pc = 0; // Contador de programa
    private Map<String, Integer> labels = new HashMap<>(); // Mapeamento de rótulos para endereços

    public void executeInstruction(String instruction) {
        String[] tokens = instruction.split(" ");
        String opcode = tokens[0];

        switch (opcode) {
            case "add" -> executeAddInstruction(tokens[1], tokens[2], tokens[3]);
            case "lw" -> executeLoadWordInstruction();
            case "sw" -> executeStoreWordInstruction();
            case "j" -> executeJumpInstruction(tokens[1]);
            case "jal" -> executeJumpAndLinkInstruction(tokens[1]);
            case "beq" -> executeBranchEqualInstruction(tokens[1], tokens[2], tokens[3]);
            case "bne" -> executeBranchNotEqualInstruction(tokens[1], tokens[2], tokens[3]);
            default -> System.err.println("Instrução inválida: " + instruction);
        }
        pc++;
    }

    private void executeStoreWordInstruction() {

    }

    private void executeLoadWordInstruction() {

    }

    private void executeAddInstruction(String token, String token1, String token2) {

    }

    // Implementação da instrução "j"
    private void executeJumpInstruction(String label) {
        pc = getLabelAddress(label);
    }

    // Implementação da instrução "jal"
    private void executeJumpAndLinkInstruction(String label) {
        registers[31] = pc + 1; // Salva o endereço de retorno (próxima instrução)
        pc = getLabelAddress(label);
    }

    // Implementação da instrução "beq"
    private void executeBranchEqualInstruction(String reg1, String reg2, String label) {
        int regValue1 = getRegisterValue(reg1);
        int regValue2 = getRegisterValue(reg2);
        if (regValue1 == regValue2) {
            pc = getLabelAddress(label);
        }
    }

    // Implementação da instrução "bne"
    private void executeBranchNotEqualInstruction(String reg1, String reg2, String label) {
        int regValue1 = getRegisterValue(reg1);
        int regValue2 = getRegisterValue(reg2);
        if (regValue1 != regValue2) {
            pc = getLabelAddress(label);
        }
    }

    // Métodos auxiliares para obter valores de registradores e endereços de rótulos
    private int getRegisterValue(String reg) {
        int regIndex = parseRegister(reg);
        return registers[regIndex];
    }

    private int getLabelAddress(String label) {
        return labels.getOrDefault(label, 0);
    }

    private int parseRegister(String reg) {
        return Integer.parseInt(reg.substring(1));
    }

    public void setLabel(String label, int address) {
        labels.put(label, address);
    }
}
