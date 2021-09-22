package ru.ssau.tk.dmitriy.practice;

public class TangentOperation extends Operation{
    @Override
    double apply(double number) {
        return Math.tan(number);
    }
}
