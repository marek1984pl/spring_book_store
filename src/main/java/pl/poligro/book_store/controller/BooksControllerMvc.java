/*
 * Copyright 2019 Marek Morawiec
 * User: marek
 * Date: 26.08.2019
 * Time: 16:41
 */

package pl.poligro.book_store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.poligro.book_store.model.book.Book;
import pl.poligro.book_store.repository.BookRepository;
import pl.poligro.book_store.service.BookService;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksControllerMvc {

    private BookService bookService;

    @Autowired
    public BooksControllerMvc(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String books(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "books";
    }
}
