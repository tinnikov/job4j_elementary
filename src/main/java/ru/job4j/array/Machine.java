package ru.job4j.array;

import static java.util.Arrays.copyOf;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int delivery = money - price;
        for (int coin : coins) {
            while (delivery >= coin) {
                rsl[size] = coin;
                delivery -= coin;
                size++;
            }
        }
        return copyOf(rsl, size);
    }
}
