package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.*;

public class ClassForPersonSerializationTest {

    @Test
    public void testSerializeObject() {
        Person person = new Person();
        try {
            ClassForPersonSerialization.serializeObject(new ByteArrayOutputStream(), person);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        Assert.assertThrows(FileNotFoundException.class, () -> ClassForPersonSerialization.serializeObject//
                (new FileOutputStream(""), new Object()));
        Assert.assertThrows(NotSerializableException.class, () -> ClassForPersonSerialization.serializeObject//
                (new ByteArrayOutputStream(), new Object()));
    }
}