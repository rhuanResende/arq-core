package com.logica.desenvolvimento.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidationException extends RuntimeException implements Serializable {

    public ValidationException(final String ex) {
        super(ex);
    }
}
