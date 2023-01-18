package com.restapiv0.restapiv0.exceptions;

public class InvalidIdException extends RuntimeException {

    private String message;

    public InvalidIdException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}