package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    @Test
    public void testOfApplyTangentOperation() {
        TangentOperation function = new TangentOperation();
        Assert.assertEquals(function.apply(45), 1.6197751, 0.00001);
        Assert.assertEquals(function.apply(Double.POSITIVE_INFINITY), Double.NaN);
        Assert.assertEquals(function.apply(Double.NEGATIVE_INFINITY), Double.NaN);
        Assert.assertEquals(function.apply(Double.NaN), Double.NaN);
        Assert.assertEquals(function.applyTriple(1), -0.86351841, 0.00001);
        Assert.assertEquals(function.applyTriple(Double.POSITIVE_INFINITY), Double.NaN);
        Assert.assertEquals(function.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN);
        Assert.assertEquals(function.applyTriple(Double.NaN), Double.NaN);
    }

}