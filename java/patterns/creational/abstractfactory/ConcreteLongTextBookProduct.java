package com.abstractfactory;

public class ConcreteLongTextBookProduct implements AbstractTextBookProduct {
    @Override
    public void read() {
        System.out.println("Reading a long textbook.");
    }
}