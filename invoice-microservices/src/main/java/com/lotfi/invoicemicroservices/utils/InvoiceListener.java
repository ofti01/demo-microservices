package com.lotfi.invoicemicroservices.utils;

import com.lotfi.invoicemicroservices.entities.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InvoiceListener extends AbstractMongoEventListener<Invoice> {

    private final PrimarySequenceService primarySequenceService;

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Invoice> event) {
        if(event.getSource().getId() == null) {
            event.getSource().setId(primarySequenceService.getNextValue());
        }
    }
}
