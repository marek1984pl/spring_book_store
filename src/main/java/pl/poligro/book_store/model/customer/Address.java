/*
 * Copyright 2019 Marek Morawiec
 * User: marek
 * Date: 23.08.2019
 * Time: 17:21
 */

package pl.poligro.book_store.model.customer;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String street;

    private String city;

    private String number;

    private String country;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
