/*
 * Copyright 2019 Marek Morawiec
 * User: marek
 * Date: 26.08.2019
 * Time: 15:35
 */

package pl.poligro.book_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.poligro.book_store.model.book.Book;
import pl.poligro.book_store.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook(Book b) {
        bookRepository.save(b);
    }

    public List<Book> getAllBooks() {
         return (List<Book>) bookRepository.findAll();
    }

    public Book findBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null);
    }
}
