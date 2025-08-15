package com.mvc.view;
import com.mvc.model.Book;

public class LibraryView {
    public void showBooks(java.util.List<Book> books) {
        System.out.println("=== LIBRARY BOOKS ===");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String status = book.isBorrowed() ? "Borrowed" : "Available";
            System.out.printf("%d. %s [%s]%n", i + 1, book.getTitle(), status);
        }
        System.out.println();
    }

    public void showBorrowResult(String message) {
        System.out.println(message);
    }
}
