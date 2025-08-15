package com.mvc.controller;

import com.mvc.model.*;
import com.mvc.view.LibraryView;

public class LibraryController {
    private Library library;
    private LibraryView view;

    public LibraryController(Library library, LibraryView view) {
        this.library = library;
        this.view = view;
    }

    public void displayBooks() {
        view.showBooks(library.getBooks());
    }

    public void borrowBook(int index) {
        Book book = library.getBook(index);
        if (book != null && !book.isBorrowed()) {
            book.borrow();
            view.showBorrowResult("You borrowed: " + book.getTitle());
        } else {
            view.showBorrowResult("Book not available.");
        }
    }
}
