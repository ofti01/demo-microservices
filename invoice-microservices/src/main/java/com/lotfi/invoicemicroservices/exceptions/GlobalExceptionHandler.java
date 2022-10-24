package com.lotfi.invoicemicroservices.exceptions;

import com.lotfi.invoicemicroservices.dtos.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RessourceNotFound.class)
    public ResponseEntity<ErrorDetails> handleNotFoundRessourvc(RessourceNotFound ressource, WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ressource.getMessage(),webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
