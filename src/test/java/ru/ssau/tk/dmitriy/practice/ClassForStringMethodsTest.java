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

    @Test
    public void testSubstringSearchInTheSecondHalf() {
        ClassForStringMethods object = new ClassForStringMethods();
        Assert.assertEquals(object.substringSearchInTheSecondHalf("deinstitutionalization", "at"), 17);
        Assert.assertEquals(object.substringSearchInTheSecondHalf("deinstitutionalization", "io"), 19);
        Assert.assertEquals(object.substringSearchInTheSecondHalf("deinstitutionalization", "al"), 13);
        Assert.assertEquals(object.substringSearchInTheSecondHalf("deinstitutionalization", "xyz"), -1);
    }

    @Test
    public void testLastIndexOfSubstringInStringInFirstHalf() {
        ClassForStringMethods object = new ClassForStringMethods();
        Assert.assertEquals(object.lastIndexOfSubstringInStringInFirstHalf("Floccinaucinihilipilification", "oc"), 2);
        Assert.assertEquals(object.lastIndexOfSubstringInStringInFirstHalf("Floccinaucinihilipilification", "nauc"), 6);
        Assert.assertEquals(object.lastIndexOfSubstringInStringInFirstHalf("Floccinaucinihilipilification", "ihi"), 12);
        Assert.assertEquals(object.lastIndexOfSubstringInStringInFirstHalf("Floccinaucinihilipilification", "zxy"), -1);
    }

    @Test
    public void testGetNumberOfLinesWithSpecifiedStartAndEnd() {
        ClassForStringMethods object = new ClassForStringMethods();
        String[] array = {"asxdoktr", "asxutyopi", "gyrteopi"};
        Assert.assertEquals(object.getNumberOfLinesWithSpecifiedStartAndEnd(array, "asx", "opi"), 1);
        array = new String[]{"oufrtsqp", "ghutyinsqp", "ghujfoisesqp"};
        Assert.assertEquals(object.getNumberOfLinesWithSpecifiedStartAndEnd(array, "ghu", "sqp"), 2);
    }

    @Test
    public void testGetNumberOfLinesWithSpecifiedStartAndEndWithoutSpaces() {
        ClassForStringMethods object = new ClassForStringMethods();
        String[] array = {" obvporfdsw ", "  ovbnfrd  ", "     ovboutydsw   "};
        Assert.assertEquals(object.getNumberOfLinesWithSpecifiedStartAndEndWithoutSpaces(array, "ovb", "dsw"), 1);
        array = new String[]{"  kuhlsnlob ", " kuhmksldvn  ", "   kuhfiudlob   "};
        Assert.assertEquals(object.getNumberOfLinesWithSpecifiedStartAndEndWithoutSpaces(array, "kuh", "lob"), 2);
    }
}