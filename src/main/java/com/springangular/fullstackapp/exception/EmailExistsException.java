package com.springangular.fullstackapp.exception;

public class EmailExistsException extends Exception{
    public EmailExistsException(String message) {
        super(message);
    }
}
