package ru.ssau.tk.dmitriy.practice;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ClassForPersonSerialization {
    public static void serializeObject(OutputStream outputStream, Object object) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(object);
    }
}
