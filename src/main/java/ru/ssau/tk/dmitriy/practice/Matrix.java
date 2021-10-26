package ru.ssau.tk.dmitriy.practice;

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
}
