package ru.ssau.tk.dmitriy.practice;

public class IntGeneratorImpl implements IntGenerator {
    private int counterOfCalls;

    public IntGeneratorImpl() {
        counterOfCalls = 0;
    }

    @Override
    public int nextInt() {
        return counterOfCalls++;
    }
}
