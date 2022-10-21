package com.lotfi.invoicemicroservices.controllers;

import com.lotfi.invoicemicroservices.dtos.InvoiceDto;
import com.lotfi.invoicemicroservices.services.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/invoice")
@RequiredArgsConstructor
public class InvoiceController {

    private final InvoiceService invoiceService;

    @PostMapping
    public ResponseEntity<InvoiceDto> saveInvoice(@RequestBody InvoiceDto invoiceDto){
        InvoiceDto inv = invoiceService.addInvoice(invoiceDto);
        return new ResponseEntity<>(inv, HttpStatus.CREATED);
    }
}
