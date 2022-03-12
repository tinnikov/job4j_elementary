package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenLeftMore() {
        int left = 3;
        int right = 2;
        int expected = 3;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenRightMore() {
        int left = 10;
        int right = 15;
        int expected = 15;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLeftEqualRight() {
        int left = 20;
        int right = 20;
        int expected = 20;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }
}