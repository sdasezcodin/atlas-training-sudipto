package com.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        ComputerFacade myPC = new ComputerFacade();
        myPC.startComputer(); // one method call to start whole system!
    }
}

