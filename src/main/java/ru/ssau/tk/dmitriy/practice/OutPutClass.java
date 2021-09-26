package ru.ssau.tk.dmitriy.practice;

public class OutPutClass {
    public static void main(String[] args) {
        byte byteValue = 2;
        char charValue = 2;
        short shortValue = 2;
        int intValue = 2;
        long longValue = 2;
        float floatValue = 2;
        double doubleValue = 2;
        Person firstObject = new Person();
        Person secondObject = null;
        String thirdObject = "string";
        OutPutClass.printType(byteValue);
        OutPutClass.printType(charValue);
        OutPutClass.printType(shortValue);
        OutPutClass.printType(intValue);
        OutPutClass.printType(longValue);
        OutPutClass.printType(floatValue);
        OutPutClass.printType(doubleValue);
        OutPutClass.printType(secondObject);
        OutPutClass.printType(firstObject);
        OutPutClass.printType(thirdObject);
    }

    public static void printType(byte expression) {
        System.out.println("byte");
    }

    public static void printType(char expression) {
        System.out.println("char");
    }

    public static void printType(short expression) {
        System.out.println("short");
    }

    public static void printType(int expression) {
        System.out.println("int");
    }

    public static void printType(long expression) {
        System.out.println("long");
    }

    public static void printType(float expression) {
        System.out.println("float");
    }

    public static void printType(double expression) {
        System.out.println("double");
    }

    public static void printType(boolean expression) {
        System.out.println("boolean");
    }

    public static void printType(Object expression) {
        if (expression == null) {
            System.out.println("null");
            return;
        }
        System.out.println(expression.getClass().getSimpleName());
    }
}
