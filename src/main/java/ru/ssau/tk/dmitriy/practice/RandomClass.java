package ru.ssau.tk.dmitriy.practice;

public class RandomClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getFirstName());
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }

}
/*Стоит заметить, что в процессе выполнения программы было создано 2 объекта типа Person.

До метода checkAnotherPerson() создается 1-ый объект класса Person, которому мы устанавливаем имя-Аркадий,
при вызове checkAnotherPerson(person) мы хоть и передаем в качестве параметра 1-ый объект, на самом деле,
в методе создается 2-ой объект, которому мы и устанавливае имя-Игнат.

Этим объясняется вывод сначала имени-Игнат, а затем-Аркадий.
*/
