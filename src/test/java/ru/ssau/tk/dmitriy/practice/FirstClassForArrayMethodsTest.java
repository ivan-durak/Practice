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

    @Test
    public void testGetArrayOfSquareOfNumbers() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getArrayOfSquareOfNumbers(10);
        double[] knownArray = {0.0, 1.0, 4.0, 9.0, 16.0, 25.0, 36.0, 49.0, 64.0, 81.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }

    @Test
    public void testGetSolvingTheQuadraticEquation() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] firstSolution = object.getSolvingTheQuadraticEquation(0, -5, 2);
        double[] secondSolution = object.getSolvingTheQuadraticEquation(4, 0, 9);
        double[] thirdSolution = object.getSolvingTheQuadraticEquation(3, 12, 0);
        double[] fourthSolution = object.getSolvingTheQuadraticEquation(4, 4, 1);
        double[] fifthSolution = object.getSolvingTheQuadraticEquation(1, 5, 6);
        double[] sixthSolution = object.getSolvingTheQuadraticEquation(-1, -5, 14);
        double[] seventhSolution = object.getSolvingTheQuadraticEquation((double) 1 / 3, (double) -3 / 7, (double) 9 / 5);
        double[] eighthSolution = object.getSolvingTheQuadraticEquation((double) 1 / 30, (double) -1 / 6, (double) 1 / 5);
        double[] firstKnownArray = {0.4};
        double[] secondKnownArray = {}; //0 элементов
        double[] thirdKnownArray = {-4.0, 0.0};
        double[] fourthKnownArray = {-0.5};
        double[] fifthKnownArray = {-3.0, -2.0};
        double[] sixthKnownArray = {-7.0, 2.0};
        double[] seventhKnownArray = {}; //0 элементов
        double[] eighthKnownArray = {2, 3};
        Assert.assertTrue(Arrays.equals(firstSolution, firstKnownArray));
        Assert.assertTrue(Arrays.equals(secondSolution, secondKnownArray));
        Assert.assertTrue(Arrays.equals(thirdSolution, thirdKnownArray));
        Assert.assertTrue(Arrays.equals(fourthSolution, fourthKnownArray));
        Assert.assertTrue(Arrays.equals(fifthSolution, fifthKnownArray));
        Assert.assertTrue(Arrays.equals(sixthSolution, sixthKnownArray));
        Assert.assertTrue(Arrays.equals(seventhSolution, seventhKnownArray));
        for (int i = 0; i < eighthSolution.length; i++) {
            Assert.assertEquals(eighthSolution[i], eighthKnownArray[i], 0.00001);
        }
    }

    @Test
    public void testGetArrayOfNaturalNumbersNotDivisibleBy3() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getArrayOfNaturalNumbersNotDivisibleBy3(10);
        double[] knownArray = {1.0, 2.0, 4.0, 5.0, 7.0, 8.0, 10.0, 11.0, 13.0, 14.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }

    @Test
    public void testGetArrayOfArithmeticProgression() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getArrayOfArithmeticProgression(10, -20, 3);
        double[] knownArray = {-20.0, -17.0, -14.0, -11.0, -8.0, -5.0, -2.0, 1.0, 4.0, 7.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }

    @Test
    public void testGetArrayOfGeometricProgressionName() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getArrayOfGeometricProgression(7, 100, (double) 1 / 6);
        double[] knownArray = new double[]{100.0, 16.66666, 2.77777, 0.462963, 0.07716, 0.01286, 0.00214};
        for (int i = 0; i < 7; i++)
            Assert.assertEquals(array[i], knownArray[i], 0.00001);
    }
}