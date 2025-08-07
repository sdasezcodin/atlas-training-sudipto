package com.bridge;

class SmartPhone extends Device {
    public SmartPhone(Brand brand) {
        super(brand);
    }

    public void turnOn() {
        System.out.print("ON SmartPhone: ");
        brand.powerOn();
    }

    public void turnOff() {
        System.out.print("OFF SmartPhone: ");
        brand.powerOff();
    }
}
