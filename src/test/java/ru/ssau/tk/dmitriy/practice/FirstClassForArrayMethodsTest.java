package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.testng.Assert.*;

public class FirstClassForArrayMethodsTest {

    @Test
    public void testCreateArrayWithDimension() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.createArrayWithDimension(5);
        Assert.assertTrue(Arrays.equals(array, object.createArrayWithDimension(5)));
        for (double element : array) {
            Assert.assertEquals(element, 0.0);
        }
    }
}