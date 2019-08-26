/*
 * Copyright 2019 Marek Morawiec
 * User: marek
 * Date: 23.08.2019
 * Time: 17:21
 */

package pl.poligro.book_store.model.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.poligro.book_store.model.order.CustomerOrder;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "customer")
    private List<Address> address;

    @OneToMany(mappedBy = "customer")
    private List<CustomerOrder> orders;
}
