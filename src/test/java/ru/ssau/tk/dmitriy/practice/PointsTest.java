package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {
    public static double accuracy = 0.00001;

    public static void main(String[] args) {
        Point firstPoint = new Point(23, 14, 67);
        Point secondPoint = new Point(34, 82, 70);
        double number = 2;
        System.out.println();
        System.out.println("Координаты 1-ой начальной точки: x=" + firstPoint.x + ", y=" + firstPoint.y + ", z=" + firstPoint.z);
        System.out.println("Координаты 2-ой начальной точки: x=" + secondPoint.x + ", y=" + secondPoint.y + ", z=" + secondPoint.z);
        System.out.println();
        System.out.println("Координаты полученной точки: x=" + (Points.sum(firstPoint, secondPoint)).x + ", y="
                + (Points.sum(firstPoint, secondPoint)).y + ", z=" + (Points.sum(firstPoint, secondPoint)).z);
        System.out.println("Координаты полученной точки: x=" + (Points.subtract(firstPoint, secondPoint)).x + ", y="
                + (Points.subtract(firstPoint, secondPoint)).y + ", z=" + (Points.subtract(firstPoint, secondPoint)).z);
        System.out.println("Координаты полученной точки: x=" + (Points.multiply(firstPoint, secondPoint)).x + ", y="
                + (Points.multiply(firstPoint, secondPoint)).y + ", z=" + (Points.multiply(firstPoint, secondPoint)).z);
        System.out.println("Координаты полученной точки: x=" + (Points.divide(firstPoint, secondPoint)).x + ", y="
                + (Points.divide(firstPoint, secondPoint)).y + ", z=" + (Points.divide(firstPoint, secondPoint)).z);
        System.out.println("Координаты, полученные при умножении первой точки на число: x="//
                + (Points.enlarge(firstPoint, number)).x + ", y="
                + (Points.enlarge(firstPoint, number)).y + ", z=" + (Points.enlarge(firstPoint, number)).z);
        System.out.println("Координаты, полученные при умножении второй точки на число: x="//
                + (Points.enlarge(secondPoint, number)).x + ", y="
                + (Points.enlarge(secondPoint, number)).y + ", z=" + (Points.enlarge(secondPoint, number)).z);
        System.out.println("Длина радиус-вектора первой точки: " + Points.length(firstPoint));
        System.out.println("Длина радиус-вектора второй точки: " + Points.length(secondPoint));
        System.out.println("Точка с противоположными координатами: x=" + (Points.opposite(firstPoint)).x + ", y=" //
                + (Points.opposite(firstPoint)).y + ", z=" + (Points.opposite(firstPoint)).z);
        System.out.println("Точка с противоположными координатами: x=" + (Points.opposite(secondPoint)).x + ", y="//
                + (Points.opposite(secondPoint)).y + ", z=" + (Points.opposite(secondPoint)).z);
        System.out.println("Точка с обратными координатами: x=" + (Points.inverse(firstPoint)).x + ", y=" //
                + (Points.inverse(firstPoint)).y + ", z=" + (Points.inverse(firstPoint)).z);
        System.out.println("Точка с обратными координатами: x=" + (Points.inverse(secondPoint)).x + ", y=" //
                + (Points.inverse(secondPoint)).y + ", z=" + (Points.inverse(secondPoint)).z);
        System.out.println("Скалярное произведение векторов равно " + Points.scalarProduct(firstPoint, secondPoint));
        System.out.println("Вектор, полученный в результате векторного произведения имеет координаты: x="//
                + (Points.vectorProduct(firstPoint, secondPoint)).x + ", y=" //
                + (Points.vectorProduct(firstPoint, secondPoint)).y + ", z=" //
                + (Points.vectorProduct(firstPoint, secondPoint)).z);
        Point firstPoint2 = new Point(14, 23, 45);
        Point secondPoint2 = new Point(19, 34, 51);
        System.out.println(Points.vectorProduct(firstPoint2, secondPoint2).x + " " + Points.vectorProduct(firstPoint2, secondPoint2).y + " " + Points.vectorProduct(firstPoint2, secondPoint2).z);

    }

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
        Point firstPoint = new Point(14, 23, 45);
        Point secondPoint = new Point(19, 34, 51);
        Point thirdPoint = Points.sum(firstPoint, secondPoint);
        Assert.assertTrue(equalsApproximately(Points.sum(firstPoint, secondPoint), new Point(33, 57, 96)));
    }

    @Test
    public void testOfSubtract() {
        Point firstPoint = new Point(14, 23, 45);
        Point secondPoint = new Point(19, 34, 51);
        Point thirdPoint = Points.subtract(firstPoint, secondPoint);
        Assert.assertTrue(equalsApproximately(Points.subtract(firstPoint, secondPoint), new Point(-5, -11, -6)));
    }

    @Test
    public void testOfMultiply() {
        Point firstPoint = new Point(14, 23, 45);
        Point secondPoint = new Point(19, 34, 51);
        Assert.assertTrue(equalsApproximately(Points.multiply(firstPoint, secondPoint), new Point(266, 782, 2295)));
    }

    @Test
    public void testOfDivide() {
        Point firstPoint = new Point(15, 25, 45);
        Point secondPoint = new Point(20, 50, 50);
        Assert.assertTrue(equalsApproximately(Points.divide(firstPoint, secondPoint), new Point(0.75, 0.5, 0.9)));
    }

    @Test
    public void testOfEnlarge() {
        double multiplier = 3;
        Point firstPoint = new Point(14, 23, 45);
        Point secondPoint = new Point(19, 34, 51);
        Assert.assertTrue(equalsApproximately(Points.enlarge(firstPoint, multiplier), new Point(42, 69, 135)));
        Assert.assertTrue(equalsApproximately(Points.enlarge(secondPoint, multiplier), new Point(57, 102, 153)));
    }

    @Test
    public void testOfLength() {
        Point firstPoint = new Point(10, 25, 45);
        Assert.assertTrue(equalsApproximately(Points.length(firstPoint), 52.440442));
    }

    @Test
    public void testOfOpposite() {
        Point firstPoint = new Point(14, 23, 45);
        Assert.assertTrue(equalsApproximately(Points.opposite(firstPoint), new Point(-14, -23, -45)));
    }

    @Test
    public void testOfInverse() {
        Point firstPoint = new Point(10, 25, 40);
        Point result = Points.inverse(firstPoint);
        Assert.assertTrue(equalsApproximately(Points.inverse(firstPoint), new Point(0.1, 0.04, 0.025)));
    }

    @Test
    public void testOfScalarProduct() {
        Point firstPoint = new Point(14, 23, 45);
        Point secondPoint = new Point(19, 34, 51);
        Assert.assertTrue(equalsApproximately(Points.scalarProduct(firstPoint, secondPoint), 3343));
    }

    @Test
    public void testOfVectorProduct() {
        Point firstPoint = new Point(14, 23, 45);
        Point secondPoint = new Point(19, 34, 51);
        Assert.assertTrue(equalsApproximately(Points.vectorProduct(firstPoint, secondPoint), new Point(-357, 141, 39)));
    }
}