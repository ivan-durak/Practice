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

    @Test
    public void testArrayOfCharactersFromArrayOfStrings() {
        ClassForExceptionMethods object = new ClassForExceptionMethods();
        Assert.assertEquals(object.arrayOfCharactersFromArrayOfStrings(new String[]{"descendant", "stream", "kettle", "pedestrian"},//
                3), new char[]{'c', 'e', 't', 'e'});
        Assert.assertThrows(NullPointerException.class, () -> {
            object.arrayOfCharactersFromArrayOfStrings(null, 5);
        });
        Assert.assertThrows(NullPointerException.class, () -> {
            object.arrayOfCharactersFromArrayOfStrings(new String[]{"descendant", "stream", null, "kettle", "pedestrian"}, 5);
        });
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () -> {
            object.arrayOfCharactersFromArrayOfStrings(new String[]{"descendant", "stream", "kettle", "pedestrian"}, -4);
        });
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () -> {
            object.arrayOfCharactersFromArrayOfStrings(new String[]{"descendant", "stream", "kettle", "pedestrian"}, 14);
        });
    }

    @Test
    public void testSpecificCharacterOfArrayOfStrings() {
        ClassForExceptionMethods object = new ClassForExceptionMethods();
        Assert.assertEquals(object.specificCharacterOfArrayOfStrings(new String[]{"battery", "wire", "mirror", "powder"},//
                1, 3), 'e');
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            object.specificCharacterOfArrayOfStrings(new String[]{"battery", "wire", "mirror", "powder"}, 5, 2);
        });
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () -> {
            object.specificCharacterOfArrayOfStrings(new String[]{"battery", "wire", "mirror", "powder"}, 2, 7);
        });
    }

    @Test
    public void testDividingNumbersFromStrings() {
        ClassForExceptionMethods object = new ClassForExceptionMethods();
        Assert.assertEquals(object.dividingNumbersFromStrings("5", "2"), 2);
        Assert.assertEquals(object.dividingNumbersFromStrings("7", "4"), 1);
        Assert.assertThrows(NumberFormatException.class, () -> {
            object.dividingNumbersFromStrings("eleven", "four");
        });
        Assert.assertThrows(ArithmeticException.class, () -> {
            object.dividingNumbersFromStrings("9", "0");
        });
    }

    @Test
    public void testThrowUncheckedException() {
        try {
            ClassForExceptionMethods.throwUncheckedException();
        } catch (SecondClassException secondClassException) {
            Assert.assertTrue(secondClassException.getCause() instanceof FirstClassException);
        }
    }
}