package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    @Test
    public void testOfApplyIdenticalOperation() {
        IdenticalOperation function = new IdenticalOperation();
        Assert.assertEquals(function.apply(23), 23.0, 0.00001);
        Assert.assertEquals(function.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        Assert.assertEquals(function.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);
        Assert.assertEquals(function.apply(Double.NaN), Double.NaN);
        Assert.assertEquals(function.applyTriple(23), 23.0, 0.00001);
        Assert.assertEquals(function.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        Assert.assertEquals(function.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);
        Assert.assertEquals(function.applyTriple(Double.NaN), Double.NaN);
    }
}