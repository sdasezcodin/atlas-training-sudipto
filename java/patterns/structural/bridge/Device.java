package com.bridge;

abstract class Device {
    protected Brand brand;

    public Device(Brand brand) {
        this.brand = brand;
    }

    abstract void turnOn();
    abstract void turnOff();
}
