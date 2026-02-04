package com.airtribe.learntrack.exception;

public class EntityNotFoundException extends Exception{
    public EntityNotFoundException(String m) {
        super(m);
        System.out.printf("Not found exception raised: %s", m);
    }
}
