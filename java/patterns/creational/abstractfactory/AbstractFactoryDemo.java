package com.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractBookFactory noteBookFactory = new ConcreteNoteBookFactory();
        System.out.println("NOTEBOOK FACTORY Producing notebooks:");
        AbstractNoteBookProduct longNote = noteBookFactory.createLongNoteBook();
        AbstractNoteBookProduct shortNote = noteBookFactory.createShortNoteBook();
        longNote.write();
        shortNote.write();

        System.out.println("\nNOTEBOOK FACTORY Attempting to produce textbooks:");
        try {
            AbstractTextBookProduct longText = noteBookFactory.createLongTextBook();
            longText.read();
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot produce LongTextBook: " + e.getMessage());
        }
        try {
            AbstractTextBookProduct shortText = noteBookFactory.createShortTextBook();
            shortText.read();
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot produce ShortTextBook: " + e.getMessage());
        }

        AbstractBookFactory textBookFactory = new ConcreteTextBookFactory();
        System.out.println("\nTEXTBOOK FACTORY Producing textbooks:");
        AbstractTextBookProduct longText = textBookFactory.createLongTextBook();
        AbstractTextBookProduct shortText = textBookFactory.createShortTextBook();
        longText.read();
        shortText.read();

        System.out.println("\nTEXTBOOK FACTORY Attempting to produce notebooks:");
        try {
            AbstractNoteBookProduct longNoteFromText = textBookFactory.createLongNoteBook();
            longNoteFromText.write();
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot produce LongNoteBook: " + e.getMessage());
        }
        try {
            AbstractNoteBookProduct shortNoteFromText = textBookFactory.createShortNoteBook();
            shortNoteFromText.write();
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot produce ShortNoteBook: " + e.getMessage());
        }
    }
}
