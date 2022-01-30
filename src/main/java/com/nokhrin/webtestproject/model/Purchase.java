package com.nokhrin.webtestproject.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private AppUser user;
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Product> products;
    private int totalPrice;
    private Date date;

}
