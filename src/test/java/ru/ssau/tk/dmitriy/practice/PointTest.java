package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void testTestToString() {
        Point point = new Point(2.2, 4.7, 8.4);
        Assert.assertEquals(point.toString(), "[2.2, 4.7, 8.4]");
    }
}