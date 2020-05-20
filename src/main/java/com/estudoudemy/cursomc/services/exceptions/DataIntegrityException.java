package com.estudoudemy.cursomc.services.exceptions;

public class DataIntegrityException extends RuntimeException {
    private static final long serialVersionID = 1L;

    public DataIntegrityException(String msg){
        super(msg);
    }

    public DataIntegrityException(String msg, Throwable cause){
        super(msg,cause);
    }
}
