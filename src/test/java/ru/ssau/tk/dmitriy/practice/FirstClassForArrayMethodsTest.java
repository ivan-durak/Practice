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
    public void testGetArrayOfOnes() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getArrayOfOnes(6);
        double[] knownArray = {2.0, 1.0, 1.0, 1.0, 1.0, 2.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }

    @Test
    public void testGetArrayOfOddIntegerNumbers() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getArrayOfOddIntegerNumbers(5);
        double[] knownArray = {1.0, 3.0, 5.0, 7.0, 9.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }

    @Test
    public void testGetArrayOfEvenDecreasingNumbers() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getArrayOfEvenDecreasingNumbers(7);
        double[] knownArray = {14.0, 12.0, 10.0, 8.0, 6.0, 4.0, 2.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }

    @Test
    public void testGetArrayOfFibonacciNumbers() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getArrayOfFibonacciNumbers(10);
        double[] knownArray = {0.0, 1.0, 1.0, 2.0, 3.0, 5.0, 8.0, 13.0, 21.0, 34.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }
}