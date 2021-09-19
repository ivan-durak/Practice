package ru.ssau.tk.dmitriy.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testOfSet_Getters() {
        String firstName1 = "Потап", firstName2 = "Игнат";
        String lastName1 = "Капитулин", lastName2 = "Мумиев";
        int firstPassportId = 456327291, secondPassportId = 120385472;
        Person firstPeople = new Person();
        Person secondPeople = new Person();
        firstPeople.setFirstName(firstName1);
        firstPeople.setLastName(lastName1);
        firstPeople.setPassportId(firstPassportId);
        secondPeople.setFirstName(firstName2);
        secondPeople.setLastName(lastName2);
        secondPeople.setPassportId(secondPassportId);
        Assert.assertEquals(firstPeople.getFirstName(),firstName1);
        Assert.assertEquals(firstPeople.getLastName(),lastName1);
        Assert.assertEquals(firstPeople.getPassportId(),firstPassportId);
        Assert.assertEquals(secondPeople.getFirstName(),firstName2);
        Assert.assertEquals(secondPeople.getLastName(),lastName2);
        Assert.assertEquals(secondPeople.getPassportId(),secondPassportId);
    }
}