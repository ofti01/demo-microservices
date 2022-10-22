package com.lotfi.invoicemicroservices.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RessourceNotFound extends RuntimeException {
    public RessourceNotFound(String payed_invoices) {
        super(String.format("%s Not Found",payed_invoices));
    }
}
