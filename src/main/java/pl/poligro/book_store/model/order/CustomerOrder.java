/*
 * Copyright 2019 Marek Morawiec
 * User: marek
 * Date: 23.08.2019
 * Time: 17:21
 */

package pl.poligro.book_store.model.order;

import lombok.Data;
import pl.poligro.book_store.model.customer.Customer;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDateTime;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
}
