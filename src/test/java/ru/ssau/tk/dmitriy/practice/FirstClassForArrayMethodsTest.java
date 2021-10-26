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

    @Test
    public void testGetArrayOIntegerDivisors() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getArrayOIntegerDivisors(100);
        double[] knownArray = {1.0, 2.0, 4.0, 5.0, 10.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }

    @Test
    public void testGetArrayOfPositivePrimes() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getArrayOfPositivePrimes(50);
        double[] knownArray = {2.0, 3.0, 5.0, 7.0, 11.0, 13.0, 17.0, 19.0, 23.0, 29.0, 31.0, 37.0, 41.0, 43.0, 47.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }

    @Test
    public void testGetSymmetricalArray() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = object.getSymmetricalArray(11);
        double[] knownArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
        array = object.getSymmetricalArray(8);
        knownArray = new double[]{1.0, 2.0, 3.0, 4.0, 4.0, 3.0, 2.0, 1.0};
        Assert.assertTrue(Arrays.equals(array, knownArray));
    }

    @Test
    public void testGetArrayOfElementsWithOppositeSigns() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = {-10.0, 2.0, 3.0, -25.0, 7.0};
        object.getArrayOfElementsWithOppositeSigns(array);
        Assert.assertTrue(Arrays.equals(array, new double[]{10.0, -2.0, -3.0, 25.0, -7.0}));
    }

    @Test
    public void testisNumberInTheArray() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = {1.0, 2.0, 30.5, 23.0, 48.9, -1.0, 9.2, -3};
        Assert.assertTrue(object.isNumberInTheArray(array, 30.5));
        Assert.assertFalse(object.isNumberInTheArray(array, 10));
    }

    @Test
    public void testisNullInTheArray() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        Integer[] array = {1, 3, 6, 34, 78, 30, null};
        Assert.assertTrue(object.isNullInTheArray(array));
        array = new Integer[]{3, 2, 5, 7, 89};
        Assert.assertFalse(object.isNullInTheArray(array));
    }

    @Test
    public void testGetNumberOfEvenNumbersInArray() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] knownArray = {1, 4, 6, 8, 11, 12, 45, 32, 67, 88, 9, 24, 58};
        Assert.assertEquals(object.getNumberOfEvenNumbersInArray(knownArray), 8);
    }

    @Test
    public void testGetMaximalElementInArray() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] knownArray = {23, 45, 61, 54, 78, 90, 432, 123, 456, 789, 20, 654};
        Assert.assertEquals(object.getMaximalElementInArray(knownArray), 789.0);
        knownArray = new double[]{};
        Assert.assertNull(object.getMaximalElementInArray(knownArray), null);
    }

    @Test
    public void testGetSumOfNumbersWithEvenIndexes() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] knownArray = {12, 34, 52, 41, 67, 80, 97, 57, 24, 689, 12};
        Assert.assertEquals(object.getSumOfNumbersWithEvenIndexes(knownArray), 264.0);
    }

    @Test
    public void testWhoHasTheMostDivisible() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] knownArray = {2, 5, 6, 8, 10, 12, 15, 21, 22, 56, 78, 99, 3};
        Assert.assertTrue(object.whoHasTheMostDivisible(knownArray));
        knownArray = new double[]{4, 8, 9, 12, 18, 45, 33, 12, 60, 24, 54, 3};
        Assert.assertFalse(object.whoHasTheMostDivisible(knownArray));
    }

    @Test
    public void testTheNumberThatRepeats() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = {1, 2, 3, 2, 5, 2, 6, 2, 7, 2, 8, 2, 9};//одно повторяющееся число
        Assert.assertEquals(object.theNumberThatRepeats(array), 2.0);
        array = new double[]{1, 3, 4, 5, 3, 2, 3, 6, 2, 5, 7, 3, 2, 8, 9, 12, 3, 2}; //несколько повторяющихся чисел
        Assert.assertEquals(object.theNumberThatRepeats(array), 3.0);
    }

    @Test
    public void testGetFirstIndexOfNumber() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = {1, 2, 3, 4, 5, 6, 4, 3, 7, 8, 3, 2, 5, 9, 10, 11, 4, 8, 9};
        Assert.assertEquals(object.getFirstIndexOfNumber(array, 9), 13);
    }

    @Test
    public void testOppositeTheMaxAndMinElements() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        double[] array = {1, 3, 5, 7, 9, -12, 2, 6, 4, 20, 10, 15, -25};
        Assert.assertEquals(array[9], 20.0);
        Assert.assertEquals(array[12], -25.0);
        object.oppositeTheMaxAndMinElements(array);
        Assert.assertEquals(array[9], -25.0);
        Assert.assertEquals(array[12], 20.0);
    }

    @Test
    public void testBitwiseNegation() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        int[] array = {1, 4, 7, 13};
        Assert.assertTrue(Arrays.equals(array, new int[]{1, 4, 7, 13}));
        object.bitwiseNegation(array);
        Assert.assertTrue(Arrays.equals(array, new int[]{-2, -5, -8, -14}));
        object.bitwiseNegation(array);
        Assert.assertTrue(Arrays.equals(array, new int[]{1, 4, 7, 13}));
    }

    @Test
    public void testGetArrayOfNegativeNumbers() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        int[] array = {23, 45, 79, 100};
        Assert.assertEquals(object.getArrayOfNegativeNumbers(array), new int[]{-24, -46, -80, -101});
        Assert.assertEquals(object.getArrayOfNegativeNumbers(object.getArrayOfNegativeNumbers(array)), array);
    }

    @Test
    public void testGetArrayOfSumOfNeighboringNumbers() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        Assert.assertEquals(object.getArrayOfSumOfNeighboringNumbers(array), new int[]{4, 12, 11, 10, 8});
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertEquals(object.getArrayOfSumOfNeighboringNumbers(array), new int[]{3, 7, 11, 15, 19});
    }

    @Test
    public void testAreElementsInArrayEven() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        int[] array = {2, 22, 3, 33, 11, 45, 6, 89, 100};
        Assert.assertEquals(object.areElementsInArrayEven(array), new boolean[]{true, true, false, false, false, false, true, false, true});
    }

    @Test
    public void testDivideANumberOfTypeLongAndGetANumberOfTypeLong() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        long number = 13315684788L;
        int[] digit = object.divideANumberOfTypeLong(number);
        Assert.assertEquals(digit[0], 3);
        Assert.assertEquals(digit[1], 430782900);
        Assert.assertEquals(object.getANumberOfTypeLong(3, 430782900), 13315684788L);
    }

    @Test
    public void testFillTheArrayWithASpecificIndex() {
        FirstClassForArrayMethods object = new FirstClassForArrayMethods();
        Assert.assertEquals(object.fillTheArrayWithASpecificIndex(9, 6), new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3});
        Assert.assertEquals(object.fillTheArrayWithASpecificIndex(6, 2), new int[]{5, 6, 1, 2, 3, 4});
    }
}