package ru.ssau.tk.dmitriy.practice;

public class FirstClassForArrayMethods {

    public double[] createArrayWithDimension(int dimension) {
        return new double[dimension];
    }

    public double[] getArraysOfOnes(int dimension) {
        double[] array = new double[dimension];
        for (int i = 0; i < array.length; i++) {
            if ((i == 0) || (i == array.length - 1)) {
                array[i] = 2;
            } else
                array[i] = 1;
        }
        return array;
    }
}