package com.mvc.model;

public class Library {
    private java.util.List<Book> books = new java.util.ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public java.util.List<Book> getBooks() { return books; }
    public Book getBook(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        return null;
    }
}
