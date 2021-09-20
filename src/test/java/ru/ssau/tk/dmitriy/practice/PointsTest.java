package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {
    public static double accuracy = 0.00001;

    private boolean equalsApproximately(double firstValue, double secondValue) {
        return Math.abs(firstValue - secondValue) < accuracy;
    }

    public boolean equalsApproximately(Point firstPoint, Point secondPoint) {
        return (equalsApproximately(firstPoint.x, secondPoint.x) &
                equalsApproximately(firstPoint.y, secondPoint.y) &
                equalsApproximately(firstPoint.z, secondPoint.z));
    }

    @Test
    public void testOfSum() {
        Point firstPoint = new Point(14.745639, 23.849563, 45.721326);
        Point secondPoint = new Point(45.563724, 34.678465, 72.567463);
        Point thirdPoint = Points.sum(firstPoint, secondPoint);
        Assert.assertTrue(equalsApproximately(Points.sum(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.subtract(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.multiply(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.divide(firstPoint, secondPoint), thirdPoint));
    }

    @Test
    public void testOfSubtract() {
        Point firstPoint = new Point(14.745639, 23.849563, 45.721326);
        Point secondPoint = new Point(45.563724, 34.678465, 72.567463);
        Point thirdPoint = Points.subtract(firstPoint, secondPoint);
        Assert.assertTrue(equalsApproximately(Points.subtract(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.sum(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.multiply(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.divide(firstPoint, secondPoint), thirdPoint));
    }

    @Test
    public void testOfMultiply() {
        Point firstPoint = new Point(14.745639, 23.849563, 45.721326);
        Point secondPoint = new Point(45.563724, 34.678465, 72.567463);
        Point thirdPoint = Points.multiply(firstPoint, secondPoint);
        Assert.assertTrue(equalsApproximately(Points.multiply(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.sum(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.subtract(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.divide(firstPoint, secondPoint), thirdPoint));
    }

    @Test
    public void testOfDivide() {
        Point firstPoint = new Point(14.745639, 23.849563, 45.721326);
        Point secondPoint = new Point(45.563724, 34.678465, 72.567463);
        Point thirdPoint = Points.divide(firstPoint, secondPoint);
        Assert.assertTrue(equalsApproximately(Points.divide(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.sum(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.subtract(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.multiply(firstPoint, secondPoint), thirdPoint));
    }

    @Test
    public void testOfEnlarge() {
        double multiplier = 2.453621;
        Point firstPoint = new Point(14.745639, 23.849563, 45.721326);
        Point secondPoint = new Point(45.563724, 34.678465, 72.567463);
        Point thirdPoint = Points.enlarge(firstPoint, multiplier);
        Assert.assertTrue(equalsApproximately(Points.enlarge(firstPoint, multiplier), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.enlarge(secondPoint, multiplier), thirdPoint));
    }

    @Test
    public void testOfLength() {
        Point firstPoint = new Point(14.745639, 23.849563, 45.721326);
        double module = Points.length(firstPoint);
        Assert.assertTrue(equalsApproximately(Points.length(firstPoint), module));
    }

    @Test
    public void testOfOpposite() {
        Point firstPoint = new Point(14.745639, 23.849563, 45.721326);
        Point result = Points.opposite(firstPoint);
        Assert.assertTrue(equalsApproximately(Points.opposite(firstPoint), result));
    }

    @Test
    public void testOfInverse() {
        Point firstPoint = new Point(14.745639, 23.849563, 45.721326);
        Point result = Points.inverse(firstPoint);
        Assert.assertTrue(equalsApproximately(Points.inverse(firstPoint), result));
        Assert.assertFalse(equalsApproximately(Points.opposite(firstPoint), result));
    }

    @Test
    public void testOfScalarProduct() {
        Point firstPoint = new Point(14.745639, 23.849563, 45.721326);
        Point secondPoint = new Point(45.563724, 34.678465, 72.567463);
        double result = Points.scalarProduct(firstPoint, secondPoint);
        Assert.assertTrue(equalsApproximately(Points.scalarProduct(firstPoint, secondPoint), result));
        Assert.assertFalse(equalsApproximately(Points.length(firstPoint), result));
        Assert.assertFalse(equalsApproximately(Points.length(secondPoint), result));
    }

    @Test
    public void testOfVectorProduct() {
        Point firstPoint = new Point(14.745639, 23.849563, 45.721326);
        Point secondPoint = new Point(45.563724, 34.678465, 72.567463);
        Point thirdPoint = Points.vectorProduct(firstPoint, secondPoint);
        Assert.assertFalse(equalsApproximately(Points.sum(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.subtract(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.multiply(firstPoint, secondPoint), thirdPoint));
        Assert.assertFalse(equalsApproximately(Points.divide(firstPoint, secondPoint), thirdPoint));

    }
}