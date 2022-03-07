package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value){
        float result = value / 70;
        return result;
    }
    public static float rubleToDollar(float value){
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(155);
        System.out.println("155 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(170);
        System.out.println("170 rubles are " + dollar + " dollar.");
    }
}
