package com.abstractfactory;

public class ConcreteNoteBookFactory implements AbstractBookFactory {
    @Override
    public AbstractNoteBookProduct createLongNoteBook() {
        return new ConcreteLongNoteBookProduct();
    }

    @Override
    public AbstractNoteBookProduct createShortNoteBook() {
        return new ConcreteShortNoteBookProduct();
    }

    @Override
    public AbstractTextBookProduct createLongTextBook() {
        throw new UnsupportedOperationException("This factory doesn't create textbooks.");
    }

    @Override
    public AbstractTextBookProduct createShortTextBook() {
        throw new UnsupportedOperationException("This factory doesn't create textbooks.");
    }
}
