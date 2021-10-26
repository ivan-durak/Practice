package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatricesTest {

    @Test
    public void testSumOfMatrix() {
        Matrix firstMatrix = new Matrix(3, 3);
        firstMatrix.setAt(0, 0, 3);
        firstMatrix.setAt(0, 1, 5);
        firstMatrix.setAt(0, 2, 7);   // 3 5 7
        firstMatrix.setAt(1, 0, 2);   // 2 1 8
        firstMatrix.setAt(1, 1, 1);   // 6 3 1
        firstMatrix.setAt(1, 2, 8);
        firstMatrix.setAt(2, 0, 6);
        firstMatrix.setAt(2, 1, 3);
        firstMatrix.setAt(2, 2, 1);
        Matrix secondMatrix = new Matrix(3, 3);
        secondMatrix.setAt(0, 0, 2);
        secondMatrix.setAt(0, 1, 4);
        secondMatrix.setAt(0, 2, 5);   // 2 4 5
        secondMatrix.setAt(1, 0, 6);   // 6 10 9
        secondMatrix.setAt(1, 1, 10);  // 7 3 1
        secondMatrix.setAt(1, 2, 9);
        secondMatrix.setAt(2, 0, 7);
        secondMatrix.setAt(2, 1, 3);
        secondMatrix.setAt(2, 2, 1);
        Matrix resultMatrix = Matrices.sumOfMatrix(firstMatrix, secondMatrix);
        Assert.assertNotNull(resultMatrix);
        Assert.assertEquals(resultMatrix.getAt(0, 2), 12.0);
        Assert.assertEquals(resultMatrix.getAt(1, 0), 8.0);
        Assert.assertEquals(resultMatrix.getAt(2, 1), 6.0);
    }

    @Test
    public void testSubtractOfMatrix() {
        Matrix firstMatrix = new Matrix(3, 3);
        firstMatrix.setAt(0, 0, 3);
        firstMatrix.setAt(0, 1, 5);
        firstMatrix.setAt(0, 2, 7);   // 3 5 7
        firstMatrix.setAt(1, 0, 2);   // 2 1 8
        firstMatrix.setAt(1, 1, 1);   // 6 3 1
        firstMatrix.setAt(1, 2, 8);
        firstMatrix.setAt(2, 0, 6);
        firstMatrix.setAt(2, 1, 3);
        firstMatrix.setAt(2, 2, 1);
        Matrix secondMatrix = new Matrix(3, 3);
        secondMatrix.setAt(0, 0, 2);
        secondMatrix.setAt(0, 1, 4);
        secondMatrix.setAt(0, 2, 5);   // 2 4 5
        secondMatrix.setAt(1, 0, 6);   // 6 10 9
        secondMatrix.setAt(1, 1, 10);  // 7 3 1
        secondMatrix.setAt(1, 2, 9);
        secondMatrix.setAt(2, 0, 7);
        secondMatrix.setAt(2, 1, 3);
        secondMatrix.setAt(2, 2, 1);
        Matrix resultMatrix = Matrices.subtractOfMatrix(firstMatrix, secondMatrix);
        Assert.assertNotNull(resultMatrix);
        Assert.assertEquals(resultMatrix.getAt(0, 2), 2.0);
        Assert.assertEquals(resultMatrix.getAt(1, 0), -4.0);
        Assert.assertEquals(resultMatrix.getAt(2, 1), 0.0);

    }

    @Test
    public void testMultiplyMatrixOnNumber() {
        Matrix firstMatrix = new Matrix(3, 3);
        firstMatrix.setAt(0, 0, 3);
        firstMatrix.setAt(0, 1, 5);
        firstMatrix.setAt(0, 2, 7);   // 3 5 7
        firstMatrix.setAt(1, 0, 2);   // 2 1 8
        firstMatrix.setAt(1, 1, 1);   // 6 3 1
        firstMatrix.setAt(1, 2, 8);
        firstMatrix.setAt(2, 0, 6);
        firstMatrix.setAt(2, 1, 3);
        firstMatrix.setAt(2, 2, 1);
        Matrix resultMatrix = Matrices.multiplyMatrixOnNumber(firstMatrix, 3);
        Assert.assertNotNull(resultMatrix);
        Assert.assertEquals(resultMatrix.getAt(0, 1), 15.0);
        Assert.assertEquals(resultMatrix.getAt(1, 0), 6.0);
        Assert.assertEquals(resultMatrix.getAt(2, 2), 3.0);
    }

    @Test
    public void testMultiplyOfMatrix() {
        Matrix firstMatrix = new Matrix(3, 3);
        firstMatrix.setAt(0, 0, 3);
        firstMatrix.setAt(0, 1, 5);
        firstMatrix.setAt(0, 2, 7);   // 3 5 7
        firstMatrix.setAt(1, 0, 2);   // 2 1 8
        firstMatrix.setAt(1, 1, 1);   // 6 3 1
        firstMatrix.setAt(1, 2, 8);
        firstMatrix.setAt(2, 0, 6);
        firstMatrix.setAt(2, 1, 3);
        firstMatrix.setAt(2, 2, 1);
        Matrix secondMatrix = new Matrix(3, 3);
        secondMatrix.setAt(0, 0, 2);
        secondMatrix.setAt(0, 1, 4);
        secondMatrix.setAt(0, 2, 5);   // 2 4 5
        secondMatrix.setAt(1, 0, 6);   // 6 10 9
        secondMatrix.setAt(1, 1, 10);  // 7 3 1
        secondMatrix.setAt(1, 2, 9);
        secondMatrix.setAt(2, 0, 7);
        secondMatrix.setAt(2, 1, 3);
        secondMatrix.setAt(2, 2, 1);
        Matrix resultMatrix = Matrices.multiplyOfMatrix(firstMatrix, secondMatrix);
        Assert.assertNotNull(resultMatrix);
        Assert.assertEquals(resultMatrix.getAt(0, 0), 85.0);
        Assert.assertEquals(resultMatrix.getAt(0, 1), 83.0);
        Assert.assertEquals(resultMatrix.getAt(0, 2), 67.0);
        Assert.assertEquals(resultMatrix.getAt(1, 0), 66.0);
        Assert.assertEquals(resultMatrix.getAt(1, 1), 42.0);
        Assert.assertEquals(resultMatrix.getAt(1, 2), 27.0);
        Assert.assertEquals(resultMatrix.getAt(2, 0), 37.0);
        Assert.assertEquals(resultMatrix.getAt(2, 1), 57.0);
        Assert.assertEquals(resultMatrix.getAt(2, 2), 58.0);
    }
}