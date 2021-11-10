package ru.ssau.tk.dmitriy.practice;

public class IncompatibleDimensionsException extends RuntimeException{

    public IncompatibleDimensionsException() {
        super("The required dimensions do not match");
    }

    public IncompatibleDimensionsException(String string) {
        super(string);
    }
}
