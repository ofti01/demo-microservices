package com.lotfi.invoicemicroservices.services;

import com.lotfi.invoicemicroservices.dtos.InvoiceDto;
import com.lotfi.invoicemicroservices.entities.Invoice;
import com.lotfi.invoicemicroservices.exceptions.RessourceNotFound;
import com.lotfi.invoicemicroservices.repositories.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceDto addInvoice(InvoiceDto invoiceDto){
        Invoice inv = invoiceRepository.insert(fromDto(invoiceDto));
        return maptoDto(inv);
    }

    public InvoiceDto getInvoiceById(String id){
        Invoice invs = invoiceRepository.findById(id)
                .orElseThrow(()-> new RessourceNotFound(id));
        return maptoDto(invs);
    }

    public static Invoice fromDto(InvoiceDto invoiceDto){
        return Invoice.builder()
                .type(invoiceDto.getInvoiceType())
                .total(invoiceDto.getTotal())
                .lines(invoiceDto.getLines())
                .build();
    }
    public static InvoiceDto maptoDto(Invoice invoice){
        return InvoiceDto.builder()
                .id(invoice.getId())
                .createdAt(invoice.getCreatedAt())
                .total(invoice.getTotal())
                .invoiceType(invoice.getType())
                .lines(invoice.getLines())
                .build();
    }
}
