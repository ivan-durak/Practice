package ru.ssau.tk.dmitriy.practice;

public class SecondClassException extends RuntimeException {
    public SecondClassException() {
        super();
    }

    public SecondClassException(String string) {
        super(string);
    }

    public SecondClassException(Exception exception) {
        super(exception);
    }

}
