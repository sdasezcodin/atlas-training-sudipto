package com.mvc.model;

public class Book {
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }
    public String getTitle() { return title; }
    public boolean isBorrowed() { return isBorrowed; }
    public void borrow() { isBorrowed = true; }
}
