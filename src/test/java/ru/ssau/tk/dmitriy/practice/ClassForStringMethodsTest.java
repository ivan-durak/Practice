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

    @Test
    public void testDoTheStringsDifferOnlyInCase() {
        ClassForStringMethods object = new ClassForStringMethods();
        Assert.assertTrue(object.doTheStringsDifferOnlyInCase("EpSILoNN", "EpsilonN"));
        Assert.assertTrue(object.doTheStringsDifferOnlyInCase("AlIyFa", "alIYFA"));
        Assert.assertFalse(object.doTheStringsDifferOnlyInCase(null, null));
        Assert.assertFalse(object.doTheStringsDifferOnlyInCase(null, "FALSe"));
        Assert.assertFalse(object.doTheStringsDifferOnlyInCase("FAlse", null));
        Assert.assertFalse(object.doTheStringsDifferOnlyInCase("CoNtROLL", "ShiFT"));
    }

    @Test
    public void testSubstringSearch() {
        ClassForStringMethods object = new ClassForStringMethods();
        Assert.assertEquals(object.substringSearch("coalition", "al"), 2);
        Assert.assertEquals(object.substringSearch("cocylka", "lka"), 4);
        Assert.assertEquals(object.substringSearch("kilometre", "awq"), -1);
    }
}