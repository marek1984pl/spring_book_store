/*
 * Copyright 2019 Marek Morawiec
 * User: marek
 * Date: 23.08.2019
 * Time: 17:21
 */

package pl.poligro.book_store.model.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String author;

    private Integer year;

    private String publisher;

    private Long isbn;

    private Integer numberOfPages;
}
