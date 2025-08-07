package com.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Device myPhone = new SmartPhone(new Apple());
        myPhone.turnOn();
        myPhone.turnOff();

        System.out.println("----------------------------");

        Device myTablet = new Tablet(new Samsung());
        myTablet.turnOn();
        myTablet.turnOff();
    }
}

