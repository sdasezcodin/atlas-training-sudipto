package com.facade;

public class Disk {
    public String read(long lba, int size) {
        String data = "OS Boot Data";
        System.out.println("Reading " + size + " bytes from disk at position " + lba);
        return data;
    }
}

