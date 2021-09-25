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

    @Test
    public void testOfFieldGender() {
        Gender testGender = Gender.Female;
        Person firstTestObject = new Person("Михаил", "Ортохов", 123432565);
        firstTestObject.setGender(testGender);
        Person secondTestObject = new Person("Егор", "Футонасов", 734926457, "Male");
        Assert.assertEquals(firstTestObject.getGender(), Gender.Female);
        Assert.assertEquals(secondTestObject.getGender(),Gender.Male);
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
        Assert.assertEquals(testObject.getFirstName(), "Арарат");
        Assert.assertEquals(testObject.getLastName(), "Манекян");
        Assert.assertEquals(testObject.getPassportId(), 0);
    }

    @Test
    public void testOfThirdConstructor() { //Конструктор с одним параметром:паспорт
        int testValue = 237451982;
        Person testObject = new Person(testValue);
        Assert.assertEquals(testObject.getFirstName(), ""); //в оригинальном кострукторе так
        Assert.assertEquals(testObject.getLastName(), "");
        Assert.assertEquals(testObject.getPassportId(), 237451982);
    }

    @Test
    public void testOfFourthConstructor() { //Конструктор с тремя параметрами
        String testFirstName = "Аполон", testLastName = "Вяземский";
        int testValue = 109428394;
        Person testObject = new Person(testFirstName, testLastName, testValue);
        Assert.assertEquals(testObject.getFirstName(), "Аполон");
        Assert.assertEquals(testObject.getLastName(), "Вяземский");
        Assert.assertEquals(testObject.getPassportId(), 109428394);
    }

    @Test
    public void testOfFifthConstructor() { //Коструктор с 4-мя параметрами
        String testFirstName = "Павел", testLastName = "Овчинкин";
        int testPassportId = 349023185;
        Gender gender = Gender.Male;
        Person testObject = new Person(testFirstName, testLastName, testPassportId, gender);
        Assert.assertEquals(testObject.getFirstName(), "Павел");
        Assert.assertEquals(testObject.getLastName(), "Овчинкин");
        Assert.assertEquals(testObject.getPassportId(), 349023185);
        Assert.assertEquals(testObject.getGender(), Gender.Male);
    }
}