package com.ahmedzahran.catelog_service.demo;

import com.ahmedzahran.catelog_service.domain.Book;
import com.ahmedzahran.catelog_service.domain.BookRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("testdata")
public class BookDataLoader {
    private final BookRepository bookRepository;

    public BookDataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void LoadBookTestData(){
        Book book1 = new Book("1234567891", "The Great Gatsby", "F. Scott Fitzgerald", 9.90);
        Book book2 = new Book("1234567892", "To Kill a Mockingbird", "Harper Lee", 12.90);

        bookRepository.save(book1);
        bookRepository.save(book2);

    }
}
