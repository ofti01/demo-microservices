package com.lotfi.invoicemicroservices.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data
public class LineItem {

    private String nomProduit;
    private int quantity;
    private double prixTTC;
}
