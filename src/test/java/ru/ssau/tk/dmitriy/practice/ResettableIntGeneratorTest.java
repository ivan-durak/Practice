package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {

    @Test
    public void testNextInt() {
        IntGenerator objectLink = new ResettableIntGenerator();
        Assert.assertEquals(objectLink.nextInt(), 0);
        objectLink.nextInt();
        objectLink.nextInt();
        Assert.assertEquals(objectLink.nextInt(), 3);
    }

    @Test
    public void testReset() {
        Resettable firstObjectLink = new ResettableIntGenerator();
        IntGenerator secondObjectLink = (IntGenerator) firstObjectLink;
        Assert.assertEquals(secondObjectLink.nextInt(), 0);
        secondObjectLink.nextInt();
        secondObjectLink.nextInt();
        Assert.assertEquals(secondObjectLink.nextInt(), 3);
        firstObjectLink.reset();
        Assert.assertEquals(secondObjectLink.nextInt(), 0);
        Assert.assertEquals(secondObjectLink.nextInt(), 1);
        firstObjectLink.reset();
        Assert.assertEquals(secondObjectLink.nextInt(), 0);
    }
}