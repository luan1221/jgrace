package org.luansena.hardware;

public class Memory {

    private static final int[] addresses = new int[1024];

    public static void store(int data, int address) {
        addresses[address] = data;
    }

    public static int load(int address) {
        return addresses[address];
    }


}
