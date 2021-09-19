package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    //работающие методы
    @Test
    public void testOfFieldFirstName() { //работающий метод
        String testValue = null; //для введения вместо null:Потап, Игнат
        Person human = new Person();
        human.setFirstName(testValue);
        Assert.assertEquals(human.getFirstName(), testValue);
    }

    @Test
    public void testOfFieldSecondName() { //работающий метод
        String testValue = null; //для введения вместо null:Капитулин, Мумиев
        Person human = new Person();
        human.setLastName(testValue);
        Assert.assertEquals(human.getLastName(), testValue);
    }

    @Test
    public void testOfFieldPassportId() { //работающий метод
        int testValue = 456327291; //120385472
        Person human = new Person();
        human.setPassportId(testValue);
        Assert.assertEquals(human.getPassportId(), testValue);
    }

    //неработающие методы
    @Test
    public void testOfFieldFirstName2() { //не будет выполнен,т.к. вызов проверки до установки поля
        String testValue = null;
        Person human = new Person();
        Assert.assertEquals(human.getFirstName(), testValue);
        human.setFirstName(testValue);
    }

    @Test
    public void testOfFieldSecondName2() { //не будет выполнен,т.к. вызов проверки до установки поля
        String testValue = null;
        Person human = new Person();
        Assert.assertEquals(human.getLastName(), testValue);
        human.setLastName(testValue);
    }

    @Test
    public void testOfFieldPassportId2() { //не будет выполнен,т.к. вызов проверки до установки поля
        int testValue = 456327291;
        Person human = new Person();
        Assert.assertEquals(human.getPassportId(), testValue);
        human.setPassportId(testValue);
    }

    //тесты конструкторов
    @Test
    public void testOfFirstConstructor() { //Конструктор без параметров
        Person testObject = new Person();
        Assert.assertEquals(testObject.getFirstName(), ""); ////в оригинальном кострукторе так
        Assert.assertEquals(testObject.getLastName(), "");
        Assert.assertEquals(testObject.getPassportId(), 0);
    }

    @Test
    public void testOfSecondConstructor() { //Конструктор с двумя параметрами:имя и фамилия
        String testFirstName = "Арарат", testLastName = "Манекян";
        Person testObject = new Person(testFirstName, testLastName);
        Assert.assertEquals(testObject.getFirstName(), testFirstName);
        Assert.assertEquals(testObject.getLastName(), testLastName);
        Assert.assertEquals(testObject.getPassportId(), 0);
    }

    @Test
    public void testOfThirdConstructor() { //Конструктор с одним параметром:паспорт
        int testValue = 237451982;
        Person testObject = new Person(testValue);
        Assert.assertEquals(testObject.getFirstName(), ""); //в оригинальном кострукторе так
        Assert.assertEquals(testObject.getLastName(), "");
        Assert.assertEquals(testObject.getPassportId(), testValue);
    }

    @Test
    public void testOfFourthConstructor() { //Конструктор с тремя параметрами
        String testFirstName = "Аполон", testLastName = "Вяземский";
        int testValue = 109428394;
        Person testObject = new Person(testFirstName, testLastName, testValue);
        Assert.assertEquals(testObject.getFirstName(), testFirstName);
        Assert.assertEquals(testObject.getLastName(), testLastName);
        Assert.assertEquals(testObject.getPassportId(), testValue);
    }
}