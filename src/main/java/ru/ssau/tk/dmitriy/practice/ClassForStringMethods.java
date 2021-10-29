package ru.ssau.tk.dmitriy.practice;

public class ClassForStringMethods {

    public void stringCharactersInTheConsole(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public void bytesOfTheStringInTheConsole(String string) {
        byte[] bytesOfString = string.getBytes();
        for (byte b : bytesOfString) {
            System.out.println(b);
        }
    }

    public void comparingStringsInDifferentWays() {
        String literal = "dofuhty";
        String string = new String(literal);
        System.out.println(string == literal);
        System.out.println(literal.equals(string));
    }

    public boolean isTheStringAPalindrome(String string) {
        boolean result = true;
        for (int i = 0; i < (string.length() / 2); i++) {
            if (string.charAt(i) != string.charAt((string.length() - 1) - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
