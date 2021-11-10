package ru.ssau.tk.dmitriy.practice;

public class SecondClassOverrideClone implements Cloneable {
    String name;

    public SecondClassOverrideClone(String name) {
        this.name = name;
    }

    @Override
    public SecondClassOverrideClone clone() throws CloneNotSupportedException {
        return (SecondClassOverrideClone) super.clone();
    }
}
