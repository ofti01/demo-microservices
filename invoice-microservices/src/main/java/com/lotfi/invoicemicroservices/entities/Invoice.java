package com.lotfi.invoicemicroservices.entities;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.util.List;

@Document(collection = "invoices")
@Getter
@Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Invoice extends AbstractEntity {

    private double total;

    @Field("invoice_type")
    private InvoiceType type;

    private List<LineItem> lines;

}
