package ru.ssau.tk.dmitriy.practice;

public class FirstClassOverrideClone {
    String name;

    public FirstClassOverrideClone(String name) {
        this.name = name;
    }

    @Override
    public FirstClassOverrideClone clone() throws CloneNotSupportedException {
        return (FirstClassOverrideClone) super.clone();
    }
}
