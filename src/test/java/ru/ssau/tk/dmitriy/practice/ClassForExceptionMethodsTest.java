package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClassForExceptionMethodsTest {

    @Test
    public void testWhatKindOfPerson() {
        ClassForExceptionMethods object = new ClassForExceptionMethods();
        Assert.assertThrows(NullPointerException.class, () -> {
            object.whatKindOfPerson(null);
        });
    }
}