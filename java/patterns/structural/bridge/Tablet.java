package com.bridge;

class Tablet extends Device {
    public Tablet(Brand brand) {
        super(brand);
    }

    public void turnOn() {
        System.out.print("ON Tablet: ");
        brand.powerOn();
    }

    public void turnOff() {
        System.out.print("OFF Tablet: ");
        brand.powerOff();
    }
}
