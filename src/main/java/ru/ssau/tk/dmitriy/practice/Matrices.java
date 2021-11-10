package ru.ssau.tk.dmitriy.practice;

public class Matrices {
    public static Matrix sumOfMatrix(Matrix firstMatrix, Matrix secondMatrix) {
        boolean areLengthsEqual;
        if ((areLengthsEqual = (firstMatrix.getNumberOfLines() != secondMatrix.getNumberOfLines()))//
                || (firstMatrix.getNumberOfColumns() != secondMatrix.getNumberOfColumns())) {
            if (areLengthsEqual) {
                throw new IncompatibleDimensionsException("different number of lines");
            } else {
                throw new IncompatibleDimensionsException("different number of columns");
            }
        }
        Matrix newMatrix = new Matrix(firstMatrix.getNumberOfLines(), firstMatrix.getNumberOfColumns());
        for (int i = 0; i < firstMatrix.getNumberOfLines(); i++) {
            for (int j = 0; j < firstMatrix.getNumberOfColumns(); j++) {
                newMatrix.setAt(i, j, (firstMatrix.getAt(i, j) + secondMatrix.getAt(i, j)));
            }
        }
        return newMatrix;
    }

    public static Matrix subtractOfMatrix(Matrix firstMatrix, Matrix secondMatrix) {
        boolean areLengthsEqual;
        if ((areLengthsEqual = (firstMatrix.getNumberOfLines() != secondMatrix.getNumberOfLines()))//
                || (firstMatrix.getNumberOfColumns() != secondMatrix.getNumberOfColumns())) {
            if (areLengthsEqual) {
                throw new IncompatibleDimensionsException("different number of lines");
            } else {
                throw new IncompatibleDimensionsException("different number of columns");
            }
        }
        Matrix newMatrix = new Matrix(firstMatrix.getNumberOfLines(), firstMatrix.getNumberOfColumns());
        for (int i = 0; i < firstMatrix.getNumberOfLines(); i++) {
            for (int j = 0; j < firstMatrix.getNumberOfColumns(); j++) {
                newMatrix.setAt(i, j, (firstMatrix.getAt(i, j) - secondMatrix.getAt(i, j)));
            }
        }
        return newMatrix;
    }

    public static Matrix multiplyMatrixOnNumber(Matrix matrix, double number) {
        Matrix newMatrix = new Matrix(matrix.getNumberOfLines(), matrix.getNumberOfColumns());
        for (int i = 0; i < matrix.getNumberOfLines(); i++) {
            for (int j = 0; j < matrix.getNumberOfColumns(); j++) {
                newMatrix.setAt(i, j, (matrix.getAt(i, j) * number));
            }
        }
        return newMatrix;
    }

    public static Matrix multiplyOfMatrix(Matrix firstMatrix, Matrix secondMatrix) {
        if (firstMatrix.getNumberOfLines() != secondMatrix.getNumberOfColumns()) {
            throw new IncompatibleDimensionsException("The number of rows is not equal to the number of columns");
        }
        Matrix newMatrix = new Matrix(firstMatrix.getNumberOfLines(), secondMatrix.getNumberOfColumns());
        for (int k = 0; k < firstMatrix.getNumberOfLines(); k++) {
            for (int i = 0; i < firstMatrix.getNumberOfLines(); i++) {
                double sumOfMultiplication = 0;
                for (int j = 0; j < firstMatrix.getNumberOfColumns(); j++) {
                    sumOfMultiplication += firstMatrix.getAt(k, j) * secondMatrix.getAt(j, i);
                }
                newMatrix.setAt(k, i, sumOfMultiplication);
            }
        }
        return newMatrix;
    }
}
