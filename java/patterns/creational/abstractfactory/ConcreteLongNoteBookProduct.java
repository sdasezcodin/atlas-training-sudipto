package com.abstractfactory;

public class ConcreteLongNoteBookProduct implements AbstractNoteBookProduct {
    @Override
    public void write() {
        System.out.println("Writing in a long notebook.");
    }
}
