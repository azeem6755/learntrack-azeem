package com.airtribe.learntrack.exception;

public class InvalidInputException extends Exception {
    public InvalidInputException(String m) {
        super(m);
        System.out.printf("Invalid Input: %s\n", m);
    }
}