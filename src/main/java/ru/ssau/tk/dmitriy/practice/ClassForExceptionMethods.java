package ru.ssau.tk.dmitriy.practice;

public class ClassForExceptionMethods {
    public String whatKindOfPerson(Person person) {
        return person.toString();
    }

    public char[] arrayOfCharactersFromArrayOfStrings(String[] strings, int index) {
        char[] chars = new char[strings.length];
        for (int i = 0; i < strings.length; i++) {
            chars[i] = strings[i].charAt(index);
        }
        return chars;
    }
}
