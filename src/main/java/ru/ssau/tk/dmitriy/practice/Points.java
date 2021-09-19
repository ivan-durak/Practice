package ru.ssau.tk.dmitriy.practice;

public class Points {
    public static void main(String[] args) {
        Point firstPoint = new Point(23, 14, 67);
        Point secondPoint = new Point(34, 82, 70);
        double number = 2;
        System.out.println(number);
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
        System.out.println("Длина радиус-вектора первой точки: "+Points.length(firstPoint));
        System.out.println("Длина радиус-вектора второй точки: "+Points.length(secondPoint));
    }

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
}

