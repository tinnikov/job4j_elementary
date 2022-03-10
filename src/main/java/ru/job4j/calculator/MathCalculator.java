package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumAndDiffAndDiv(double first, double second) {
        return differ(first, second) + div(first, second);
    }

    public static double sumAllMath(double first, double second) {
        return sum(first, second) + multiply(first, second) + differ(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumAndDiffAndDiv(1000, 100));
        System.out.println("Результат расчета равен: " + sumAllMath(15, 30));
    }
}
