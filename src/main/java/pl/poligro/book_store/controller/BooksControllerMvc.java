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
import org.springframework.web.bind.annotation.*;
import pl.poligro.book_store.model.book.Book;
import pl.poligro.book_store.service.BookService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@Controller
@RequestMapping("/")
public class BooksControllerMvc {

    private BookService bookService;

    @Autowired
    public BooksControllerMvc(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String books(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/book/{id}")
    public String book(@PathVariable("id") Long id, Model model) {
        model.addAttribute("book", bookService.findBookById(id));
        return "book";
    }

    @GetMapping("/addBook")
    public String addBook(@ModelAttribute Book book, Model model) {
        model.addAttribute("book", book);
        return "addBook";
    }

    @GetMapping("/saveBook")
    public String saveBook(@ModelAttribute Book book) {
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable(name = "id") Long id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }

    @GetMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        model.addAttribute("book", bookService.findBookById(id));
        return "book";
    }

    @GetMapping("/create10RandomBooks")
    public String create10RandomBooks() {

        Stream.iterate(0, n -> n + 1)
                .limit(10).
                forEach(x -> bookService.saveBook(new Book(UUID.randomUUID().toString(), UUID.randomUUID().toString())));

        return "redirect:/books";
    }
}
