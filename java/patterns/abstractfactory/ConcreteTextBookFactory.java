package com.abstractfactory;


public class ConcreteTextBookFactory implements AbstractBookFactory {
    @Override
    public AbstractNoteBookProduct createLongNoteBook() {
        throw new UnsupportedOperationException("This factory doesn't create notebooks.");
    }

    @Override
    public AbstractNoteBookProduct createShortNoteBook() {
        throw new UnsupportedOperationException("This factory doesn't create notebooks.");
    }

    @Override
    public AbstractTextBookProduct createLongTextBook() {
        return new ConcreteLongTextBookProduct();
    }

    @Override
    public AbstractTextBookProduct createShortTextBook() {
        return new ConcreteShortTextBookProduct();
    }
}