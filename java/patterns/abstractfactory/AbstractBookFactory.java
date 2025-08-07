package com.abstractfactory;

public interface AbstractBookFactory {
    AbstractNoteBookProduct createLongNoteBook();
    AbstractNoteBookProduct createShortNoteBook();
    AbstractTextBookProduct createLongTextBook();
    AbstractTextBookProduct createShortTextBook();
}
