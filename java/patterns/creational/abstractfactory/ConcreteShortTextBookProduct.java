package com.abstractfactory;

public class ConcreteShortTextBookProduct implements AbstractTextBookProduct {
    @Override
    public void read() {
        System.out.println("Reading a short textbook.");
    }
}