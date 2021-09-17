package ru.ssau.tk.dmitriy.practice;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    public static void main(String[] args) {
        String firstName1 = "Pavel", firstName2 = "Mihail";
        String lastName1 = "Ovchinkin", lastName2 = "Ortohov";
        int passportId1 = 674523489, passportId2 = 239012965;
        Person people1 = new Person();
        Person people2 = new Person();
        people1.setFirstName(firstName1);
        people2.setFirstName(firstName2);
        people1.setLastName(lastName1);
        people2.setLastName(lastName2);
        people1.setPassportId(passportId1);
        people2.setPassportId(passportId2);
        System.out.println("Первый человек- это " + people1.getFirstName() + " " + people1.getLastName()//
                + " его паспорт:" + people1.getPassportId());
        System.out.println("Первый человек- это " + people2.getFirstName() + " " + people2.getLastName()//
                + " его паспорт:" + people2.getPassportId());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }
}
