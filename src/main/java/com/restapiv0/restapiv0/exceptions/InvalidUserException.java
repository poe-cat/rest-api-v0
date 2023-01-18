package com.restapiv0.restapiv0.exceptions;

import java.util.Map;

public class InvalidUserException extends RuntimeException {

    private Map<String, String> errors;

    public InvalidUserException(Map<String, String> errors) {
        super();
        this.errors = errors;
    }

    public Map<String, String> getErrors() {
        return errors;
    }
}