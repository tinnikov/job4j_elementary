package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to4() {
       int[] input = {2, 5, 8, 10, 21, 13, 101, 23};
       int source = 3;
       int dest = 4;
       int[] result = SwitchArray.swap(input, source, dest);
       int[] expected = {2, 5, 8, 21, 10, 13, 101, 23};
       Assert.assertArrayEquals(expected, result);
    }
}