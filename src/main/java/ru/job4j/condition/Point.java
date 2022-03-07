package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }

    public static void main(String[] args) {
        double result = Point.distance(1, 2, 3, 4);
        System.out.println("Расстояние между точками: " + result);
        result = Point.distance(14, 12, 344, 42);
        System.out.println("Расстояние между точками: " + result);
    }
}
