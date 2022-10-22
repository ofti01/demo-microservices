package com.lotfi.invoicemicroservices.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Getter
@Setter
public abstract class AbstractEntity {

    @Id
    private String id;

    @CreatedDate
    @Field("created_at")
    private Instant createdAt = Instant.now();

}
