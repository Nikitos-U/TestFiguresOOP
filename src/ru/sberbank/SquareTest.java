package ru.sberbank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void area() {
        Rectangle figure1 = new Rectangle(10, 10);
        Rectangle figure2 = new Rectangle(0, 0);
        Rectangle figure3 = new Rectangle(7, 7);

        double expected1 = 100;
        double expected2 = 0;
        double expected3 = 49;

        double actual1 = figure1.area();
        double actual2 = figure2.area();
        double actual3 = figure3.area();

        Assert.assertEquals(expected1, actual1,0);
        Assert.assertEquals(expected2, actual2,0);
        Assert.assertEquals(expected3, actual3,0);
    }
}