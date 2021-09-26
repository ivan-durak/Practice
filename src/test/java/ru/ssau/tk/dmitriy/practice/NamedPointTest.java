package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    @Test
    public void testOfNamedPointClass() {
        double x = 5, y = 6, z = -3;
        String nameOfPoint = "Моллюск";
        NamedPoint firstPoint = new NamedPoint();
        NamedPoint secondPoint = new NamedPoint(x, y, z);
        NamedPoint thirdPoint = new NamedPoint(x - 2, y - 5, z - 1, nameOfPoint);
        Assert.assertEquals(firstPoint.x, 0.0);
        Assert.assertEquals(firstPoint.y, 0.0);
        Assert.assertEquals(firstPoint.z, 0.0);
        Assert.assertEquals(firstPoint.getName(), "Origin");
        Assert.assertEquals(secondPoint.x, 5.0);
        Assert.assertEquals(secondPoint.y, 6.0);
        Assert.assertEquals(secondPoint.z, -3.0);
        Assert.assertEquals(thirdPoint.x, 3.0);
        Assert.assertEquals(thirdPoint.y, 1.0);
        Assert.assertEquals(thirdPoint.z, -4.0);
        Assert.assertEquals(thirdPoint.getName(), "Моллюск");
        firstPoint.setName("ImagineDragons");
        Assert.assertEquals(firstPoint.getName(), "ImagineDragons");
        thirdPoint.reset();
        Assert.assertEquals(thirdPoint.getName(), "Absent");
    }
}