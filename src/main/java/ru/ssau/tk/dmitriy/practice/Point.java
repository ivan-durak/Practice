package ru.ssau.tk.dmitriy.practice;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public static void main(String[] args) {
        Point firstPoint = new Point(3.3, 5.8, 2.1);
        Point secondPoint = new Point(2.2, 4.7, 8.4);
        System.out.println("Точка с координатами: " + "x-" + firstPoint.x + ", y-" + firstPoint.y + ", z-" + firstPoint.z);
        System.out.println("Точка с координатами: " + "x-" + secondPoint.x + ", y-" + secondPoint.y + ", z-" + secondPoint.z);
    }

    public Point(double givenX, double givenY, double givenZ) {
        x = givenX;
        y = givenY;
        z = givenZ;
    }
}
