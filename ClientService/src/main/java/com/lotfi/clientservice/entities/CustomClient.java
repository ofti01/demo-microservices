package com.lotfi.clientservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "customClient", types = {Client.class})
public interface CustomClient {
    long getId();
    String getFullName();
    String getProfession();
    Address getAddress();
}
