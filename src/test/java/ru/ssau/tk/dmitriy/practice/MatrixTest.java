package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatrixTest {

    @Test
    public void testGettersAndSetters() {
        Matrix matrix = new Matrix(3, 3);
        Assert.assertEquals(matrix.getNumberOfLines(), 3);
        Assert.assertEquals(matrix.getNumberOfColumns(), 3);
        matrix.setAt(0, 0, 3);
        matrix.setAt(0, 1, 5);
        matrix.setAt(0, 2, 7);   // 3 5 7
        matrix.setAt(1, 0, 2);   // 2 1 8
        matrix.setAt(1, 1, 1);   // 6 3 1
        matrix.setAt(1, 2, 8);
        matrix.setAt(2, 0, 6);
        matrix.setAt(2, 1, 3);
        matrix.setAt(2, 2, 1);
        Assert.assertEquals(matrix.getAt(0, 2), 7.0);
        Assert.assertEquals(matrix.getAt(1, 1), 1.0);
        Assert.assertEquals(matrix.getAt(2, 0), 6.0);
    }
}