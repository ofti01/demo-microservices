package com.lotfi.invoicemicroservices.utils;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class PrimarySequence {
    @Id
    private String id;

    private long seq;
}
