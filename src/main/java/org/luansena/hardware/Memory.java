package org.luansena.hardware;

import java.io.IOException;

public enum Memory {

    REGISTER_0("$zero", 0x0000000000000000000000000000000, 0),
    REGISTER_1("$at",   0x0000000000000000000000000000000, 1),
    REGISTER_2("$v0",   0x0000000000000000000000000000000, 2),
    REGISTER_3("$v1",   0x0000000000000000000000000000000, 3),
    REGISTER_4("$a0",   0x0000000000000000000000000000000, 4),
    REGISTER_5("$a1",   0x0000000000000000000000000000000, 5),
    REGISTER_6("$a2",   0x0000000000000000000000000000000, 6),
    REGISTER_7("$a3",   0x0000000000000000000000000000000, 7),
    REGISTER_8("$t0",   0x0000000000000000000000000000002, 8),
    REGISTER_9("$t1",   0x0000000000000000000000000000004, 9),
    REGISTER_10("$t2",  0x0000000000000000000000000000000, 10),
    REGISTER_11("$t3",  0x0000000000000000000000000000000, 11),
    REGISTER_12("$t4",  0x0000000000000000000000000000000, 12),
    REGISTER_13("$t5",  0x0000000000000000000000000000000, 13),
    REGISTER_14("$t6",  0x0000000000000000000000000000000, 14),
    REGISTER_15("$t7",  0x0000000000000000000000000000000, 15),
    REGISTER_16("$s0",  0x0000000000000000000000000000000, 16),
    REGISTER_17("$s1",  0x0000000000000000000000000000000, 17),
    REGISTER_18("$s2",  0x0000000000000000000000000000000, 18),
    REGISTER_19("$s3",  0x0000000000000000000000000000000, 19),
    REGISTER_20("$s4",  0x0000000000000000000000000000000, 20),
    REGISTER_21("$s5",  0x0000000000000000000000000000000, 21),
    REGISTER_22("$s6",  0x0000000000000000000000000000000, 22),
    REGISTER_23("$s7",  0x0000000000000000000000000000000, 23),
    REGISTER_24("$t8",  0x0000000000000000000000000000000, 24),
    REGISTER_25("$t9",  0x0000000000000000000000000000000, 25),
    REGISTER_26("$k0",  0x0000000000000000000000000000000, 26),
    REGISTER_27("$k1",  0x0000000000000000000000000000000, 27),
    REGISTER_28("$gp",  0x0000000000000000000000000000000, 28),
    REGISTER_29("$sp",  0x0000000000000000000000000000000, 29),
    REGISTER_30("$fp",  0x0000000000000000000000000000000, 30),
    REGISTER_31("$ra",  0x0000000000000000000000000000000, 31);

    private String label;
    private int value;
    private int index;


    Memory(String label, int value, int index) {
        this.label = label;
        this.value = value;
        this.index = index;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static int getValueByLabel(String label) {
        for (Memory mem : Memory.values()) {
            if (mem.getLabel().equals(label)) {
                return mem.getValue();
            }
        }
        throw new RuntimeException("Erro");
    }

    public static void setValueByLabel(String label, int val) {
        for (Memory mem : Memory.values()) {
            if (mem.getLabel().equals(label)) {
                mem.setValue(val);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getLabel());
        sb.append(": ");
        sb.append("[");
        sb.append(this.getValue());
        sb.append("]");
        return sb.toString();
    }
}
