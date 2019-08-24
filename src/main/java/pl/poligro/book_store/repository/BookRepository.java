/*
 * Copyright 2019 Marek Morawiec
 * User: marek
 * Date: 23.08.2019
 * Time: 17:56
 */

package pl.poligro.book_store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.poligro.book_store.model.book.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
