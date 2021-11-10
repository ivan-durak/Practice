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

    public char specificCharacterOfArrayOfStrings(String[] strings, int row, int index) {
        return strings[row].charAt(index);
    }

    public int dividingNumbersFromStrings(String firstNumber, String secondNumber) {
        return Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);
    }

    public static void throwCheckedException() throws FirstClassException {
        throw new FirstClassException();
    }

    public static void throwUncheckedException() {
        try {
            ClassForExceptionMethods.throwCheckedException();
        } catch (FirstClassException firstClassException) {
            throw new SecondClassException(firstClassException);
        }
    }
}
