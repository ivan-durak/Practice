package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClassForStringMethodsTest {

    @Test
    public void testIsTheStringAPalindrome() {
        ClassForStringMethods object = new ClassForStringMethods();
        String firstString = "asdffdsa", secondString = "qwertyyyewq", thirdString = "gurtrug", fourthString = "rwketafwr";
        Assert.assertTrue(object.isTheStringAPalindrome(firstString));
        Assert.assertTrue(object.isTheStringAPalindrome(thirdString));
        Assert.assertFalse(object.isTheStringAPalindrome(secondString));
        Assert.assertFalse(object.isTheStringAPalindrome(fourthString));
    }
}