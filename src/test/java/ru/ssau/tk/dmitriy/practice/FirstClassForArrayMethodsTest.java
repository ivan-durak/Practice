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
        double[] knownArray = {0.0, 0.0, 0.0, 0.0, 0.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }

    @Test
    public void testGetArraysOfOnes() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getArraysOfOnes(6);
        double[] knownArray = {2.0, 1.0, 1.0, 1.0, 1.0, 2.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }
}