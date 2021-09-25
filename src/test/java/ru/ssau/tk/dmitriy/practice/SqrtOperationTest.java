package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    @Test
    public void testOfApplySqrtOperation() {
        SqrtOperation function = new SqrtOperation();
        Assert.assertEquals(function.apply(23), 4.795831523, 0.00001);
        Assert.assertEquals(function.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        Assert.assertEquals(function.apply(Double.NEGATIVE_INFINITY), Double.NaN);
        Assert.assertEquals(function.apply(Double.NaN), Double.NaN);
        Assert.assertEquals(function.applyTriple(256), 2.0, 0.00001);
        Assert.assertEquals(function.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        Assert.assertEquals(function.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN);
        Assert.assertEquals(function.applyTriple(Double.NaN), Double.NaN);
    }

}