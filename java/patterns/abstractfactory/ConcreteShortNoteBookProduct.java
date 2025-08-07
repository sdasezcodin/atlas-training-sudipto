package com.abstractfactory;

public class ConcreteShortNoteBookProduct implements AbstractNoteBookProduct {
    @Override
    public void write() {
        System.out.println("Writing in a short notebook.");
    }
}