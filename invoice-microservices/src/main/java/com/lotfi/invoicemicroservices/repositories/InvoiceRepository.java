package com.lotfi.invoicemicroservices.repositories;

import com.lotfi.invoicemicroservices.entities.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface InvoiceRepository extends MongoRepository<Invoice,String> {

    @Query("{'invoice_type': ?0}")
    Optional<List<Invoice>> findByInvoiceType(String type);
}
