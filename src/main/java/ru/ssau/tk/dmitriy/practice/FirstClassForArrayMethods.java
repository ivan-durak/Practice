package ru.ssau.tk.dmitriy.practice;

public class FirstClassForArrayMethods {

    public double[] createArrayWithDimension(int dimension) {
        return new double[dimension];
    }

    public double[] getArrayOfOnes(int dimension) {
        double[] array = new double[dimension];
        for (int i = 0; i < array.length; i++) {
            if ((i == 0) || (i == array.length - 1)) {
                array[i] = 2;
            } else
                array[i] = 1;
        }
        return array;
    }

    public double[] getArrayOfOddIntegerNumbers(int dimension) {
        double[] array = new double[dimension];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
        }
        return array;
    }
}