package com.lotfi.invoicemicroservices.dtos;

import com.lotfi.invoicemicroservices.entities.InvoiceType;
import com.lotfi.invoicemicroservices.entities.LineItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class InvoiceDto {
    private String id;
    private Instant createdAt;
    private double total;
    private InvoiceType invoiceType;
    private List<LineItem> lines;

    public InvoiceDto( double total, InvoiceType invoiceType, List<LineItem> lines) {
        this.total = total;
        this.invoiceType = invoiceType;
        this.lines = lines;
    }
}
