package com.facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startComputer() {
        System.out.println("----- Booting System -----");
        cpu.freeze();
        String data = disk.read(100, 512);
        memory.load(100, data);
        cpu.execute();
        System.out.println("----- System Ready -----");
    }
}
