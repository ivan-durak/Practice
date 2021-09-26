package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {

    @Test
    public void testNextInt() {
        IntGenerator objectLink = new IntGeneratorImpl();
        Assert.assertEquals(objectLink.nextInt(), 0);
        objectLink.nextInt();
        objectLink.nextInt();
        objectLink.nextInt();
        Assert.assertEquals(objectLink.nextInt(), 4);
    }
}