package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

        @Test
        public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

     @Test
    public void when211to20then11() {
        double expected = 11;
        int x1 = 2;
        int y1 = 11;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12215to3699then120dot21() {
        double expected = 120.21;
        int x1 = 122;
        int y1 = 15;
        int x2 = 36;
        int y2 = 99;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}