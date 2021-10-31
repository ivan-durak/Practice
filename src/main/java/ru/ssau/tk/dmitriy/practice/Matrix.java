package ru.ssau.tk.dmitriy.practice;

import java.util.Arrays;

public class Matrix {
    private double[][] matrix;
    private final int numberOfLines;
    private final int numberOfColumns;

    public Matrix(int rowCount, int columnCount) {
        matrix = new double[rowCount][columnCount];
        numberOfLines = rowCount;
        numberOfColumns = columnCount;
    }

    public double getAt(int line, int column) {
        return matrix[line][column];
    }

    public void setAt(int line, int column, double value) {
        matrix[line][column] = value;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                string = string.concat(matrix[i][j] + (j == numberOfColumns - 1 ? ";" : ", "));
            }
            string = string.concat("\n");
        }
        return string;
    }
}
