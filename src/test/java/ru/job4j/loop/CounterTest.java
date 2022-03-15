package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromFiveToOneHundredThen2544() {
        int start = 5;
        int finish = 100;
        int result = Counter.sumByEven(start, finish);
        int expected = 2544;
        Assert.assertEquals(expected, result);
    }
}