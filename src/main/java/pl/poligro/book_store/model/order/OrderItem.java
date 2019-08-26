/*
 * Copyright 2019 Marek Morawiec
 * User: marek
 * Date: 24.08.2019
 * Time: 07:40
 */

package pl.poligro.book_store.model.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.poligro.book_store.model.book.Book;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Book book;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private CustomerOrder order;
}
