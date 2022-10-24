package com.lotfi.clientservice.entities;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fullName;
    private String profession;
    @Embedded
    private Address address;
}
