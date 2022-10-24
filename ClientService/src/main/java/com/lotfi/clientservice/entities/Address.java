package com.lotfi.clientservice.entities;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {
    private String region;
    private String code;
    private String pays;
}
