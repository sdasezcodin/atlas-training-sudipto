package com.facade;

public class Memory {
    public void load(long position, String data) {
        System.out.println("Loading data to memory: " + data + " at position " + position);
    }
}

