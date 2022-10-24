package com.lotfi.invoicemicroservices;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class InvoiceMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvoiceMicroservicesApplication.class, args);
    }
/*
    @Bean
    public CommandLineRunner start(InvoiceRepository invoiceRepository){
        return Args -> {
            LineItem item = new LineItem("spagetti",20,1800);
            List<LineItem> items = new ArrayList<>();
            items.add(item);
            invoiceRepository.insert(new Invoice(3000, InvoiceType.PAYED,items));
        };
    }*/
}
