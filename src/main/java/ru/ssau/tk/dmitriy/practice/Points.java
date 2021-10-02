package ru.ssau.tk.dmitriy.practice;

public class Points {

    private Points() {
    }

    public static Point sum(Point firstPoint, Point secondPoint) {
        double coordinateX = firstPoint.x + secondPoint.x;
        double coordinateY = firstPoint.y + secondPoint.y;
        double coordinateZ = firstPoint.z + secondPoint.z;
        return new Point(coordinateX, coordinateY, coordinateZ);
    }

    public static Point subtract(Point firstPoint, Point secondPoint) {
        double coordinateX = firstPoint.x - secondPoint.x;
        double coordinateY = firstPoint.y - secondPoint.y;
        double coordinateZ = firstPoint.z - secondPoint.z;
        return new Point(coordinateX, coordinateY, coordinateZ);
    }

    public static Point multiply(Point firstPoint, Point secondPoint) {
        double coordinateX = firstPoint.x * secondPoint.x;
        double coordinateY = firstPoint.y * secondPoint.y;
        double coordinateZ = firstPoint.z * secondPoint.z;
        return new Point(coordinateX, coordinateY, coordinateZ);
    }

    public static Point divide(Point firstPoint, Point secondPoint) {
        double coordinateX = firstPoint.x / secondPoint.x;
        double coordinateY = firstPoint.y / secondPoint.y;
        double coordinateZ = firstPoint.z / secondPoint.z;
        return new Point(coordinateX, coordinateY, coordinateZ);
    }

    public static Point enlarge(Point changeablePoint, double multiplier) {
        double coordinateX = changeablePoint.x * multiplier;
        double coordinateY = changeablePoint.y * multiplier;
        double coordinateZ = changeablePoint.z * multiplier;
        return new Point(coordinateX, coordinateY, coordinateZ);
    }

    public static double length(Point inputPoint) {
        return inputPoint.length();
    }

    public static Point opposite(Point inputPoint) {
        double coordinateX = inputPoint.x * (-1);
        double coordinateY = inputPoint.y * (-1);
        double coordinateZ = inputPoint.z * (-1);
        return new Point(coordinateX, coordinateY, coordinateZ);
    }

    public static Point inverse(Point inputPoint) {
        double coordinateX = 1 / (inputPoint.x);
        double coordinateY = 1 / (inputPoint.y);
        double coordinateZ = 1 / (inputPoint.z);
        return new Point(coordinateX, coordinateY, coordinateZ);
    }

    public static double scalarProduct(Point firstPoint, Point secondPoint) {
        return (firstPoint.x * secondPoint.x) + (firstPoint.y * secondPoint.y) + (firstPoint.z * secondPoint.z);
    }

    public static Point vectorProduct(Point firstPoint, Point secondPoint) {
        return new Point((firstPoint.y * secondPoint.z - firstPoint.z * secondPoint.y)//
                , (firstPoint.z * secondPoint.x - firstPoint.x * secondPoint.z)//
                , (firstPoint.x * secondPoint.y - firstPoint.y * secondPoint.x));
    }
}

