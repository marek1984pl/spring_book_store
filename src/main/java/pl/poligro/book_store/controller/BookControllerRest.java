/*
 * Copyright 2019 Marek Morawiec
 * User: marek
 * Date: 26.08.2019
 * Time: 15:33
 */

package pl.poligro.book_store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.poligro.book_store.model.book.Book;
import pl.poligro.book_store.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class BookControllerRest {

    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("books")
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("books/{id}")
    public Book getBookById(@PathVariable(name = "id") Long id) {
        return bookService.findBookById(id);
    }

    @GetMapping("books/getRandom")
    public Book getRandomBook() {
        int max = Math.toIntExact(bookService.countBooks());
        return bookService.findBookById((long) (Math.random() * max) - 1);
    }
}
