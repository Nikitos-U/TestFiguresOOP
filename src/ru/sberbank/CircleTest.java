package ru.sberbank;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CircleTest  {


    @Test
    public void area() {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(0);
        Circle circle3 = new Circle(-3);

        double expected1 = (100.0)*Math.PI;
        double expected2 = 0;
        double expected3 = 9*Math.PI;

        double actual1 = circle1.area();
        double actual2 = circle2.area();
        double actual3 = circle3.area();

        Assert.assertEquals(expected1,actual1,0);
        Assert.assertEquals(expected2,actual2,0);
        Assert.assertEquals(expected3,actual3,0);
    }
}
