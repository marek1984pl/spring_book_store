package pl.poligro.book_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.poligro.book_store.model.book.Book;
import pl.poligro.book_store.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookStoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(BookStoreApplication.class, args);

//        BookRepository bookRepository = ctx.getBean(BookRepository.class);

//        Book b1 = new Book(null, "1st book", "sample author",2000, "sample publisher", 1234567890123L, 123);
//        Book b2 = new Book(null, "2nd book", "sample author",2000, "sample publisher", 1234567890123L, 123);
//        Book b3 = new Book(null, "3rd book", "sample author",2000, "sample publisher", 1234567890123L, 123);
//
//        List<Book> books = new ArrayList<>();
//        books.add(b1);
//        books.add(b2);
//        books.add(b3);
//
//        books.forEach(bookRepository::save);
//        ctx.close();
    }

}
