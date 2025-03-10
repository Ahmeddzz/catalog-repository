package com.ahmedzahran.catelog_service.domain;

public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String isbn) {
        super("Book with ISBN " + isbn + " already exists");
    }
}
