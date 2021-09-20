package ru.ssau.tk.dmitriy.practice;

public class RandomClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);
        checkPerson(person);
        System.out.println(number);
        System.out.println(person.getFirstName());
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getFirstName());
    }

}
/*Первая 10 выводится, потому что в статистическом методе checkInt прописана команда вывода в консоль.

Во второй строчке выводится Oleg, потому что, передавая в метод CheckPerson, любой экземпляр класса Person
в методе поле, отвечающее за имя всегда будет переименовываться как Oleg.

В третьей строчке выводится 5, потому что при передаче в метод checkInt переменной number в метод передается только
ее копия, а само значение 5 отсатается неизмененным, поэтому прописывая вне метода метод System.out.println(number)
он возвращает 5.

Во втором случае тоже возвращается Oleg, потому что поле FirstName уже было изменено при вызове метода CheckPerson,
это происходит, потому что объект передается в методы по ссылке и никаких копирований значений не происходит
 */
