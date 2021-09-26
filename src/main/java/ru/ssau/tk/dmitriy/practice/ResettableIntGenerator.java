package ru.ssau.tk.dmitriy.practice;

public class ResettableIntGenerator implements IntGenerator, Resettable {
    private int counterOfCalls;

    public ResettableIntGenerator() {
        counterOfCalls = 0;
    }

    @Override
    public int nextInt() {
        return counterOfCalls++;
    }

    @Override
    public void reset() {
        counterOfCalls = 0;
    }
}
