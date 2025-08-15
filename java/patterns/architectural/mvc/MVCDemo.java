package com.mvc;

import com.mvc.controller.LibraryController;
import com.mvc.model.Book;
import com.mvc.model.Library;
import com.mvc.view.LibraryView;

public class MVCDemo {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Hobbit"));
        library.addBook(new Book("1984"));
        library.addBook(new Book("Clean Code"));

        LibraryView view = new LibraryView();
        LibraryController controller = new LibraryController(library, view);

        controller.displayBooks();
        controller.borrowBook(1); // Borrow "1984"
        controller.displayBooks();
    }
}
