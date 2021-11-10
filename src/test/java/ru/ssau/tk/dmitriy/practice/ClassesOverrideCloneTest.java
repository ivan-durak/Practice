package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClassesOverrideCloneTest {

    @Test
    public void testTestClone() {
        FirstClassOverrideClone firstObject = new FirstClassOverrideClone("dastin");
        SecondClassOverrideClone secondObject = new SecondClassOverrideClone("kemeron");
        try {
            FirstClassOverrideClone object = firstObject.clone(); //было брошено исключение
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
        }
        try {
            SecondClassOverrideClone object = secondObject.clone(); //броска исключения не было
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
        }
    }
}