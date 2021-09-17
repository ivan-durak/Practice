package ru.ssau.tk.dmitriy.practice;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    public static void main(String[] args) {
        String firstName1 = "Pavel", firstName2 = "Mihail", firstName3 = "Egor";
        String lastName1 = "Ovchinkin", lastName2 = "Ortohov", lastName3 = "Futonasov";
        int passportId1 = 349023185, passportId2 = 674523489, passportId3 = 239012965;
        Person firstPeople = new Person();
        Person secondPeople = new Person(firstName1, lastName1);
        Person thirdPeople = new Person(passportId2);
        Person fourthPeople = new Person(firstName3, lastName3, passportId3);
        secondPeople.setPassportId(passportId1);
        thirdPeople.setFirstName(firstName2);
        thirdPeople.setLastName(lastName2);
        System.out.println("Первый Человек- это "+firstPeople.getFirstName()+" "+firstPeople.getLastName()//
                +", "+"его паспорт "+firstPeople.getPassportId());
        System.out.println("Второй Человек- это "+secondPeople.getFirstName()+" "+secondPeople.getLastName()//
                +", "+"его паспорт "+secondPeople.getPassportId());
        System.out.println("Третий Человек- это "+thirdPeople.getFirstName()+" "+thirdPeople.getLastName()//
                +", "+"его паспорт "+thirdPeople.getPassportId());
        System.out.println("Четвертый Человек- это "+fourthPeople.getFirstName()+" "+fourthPeople.getLastName()//
                +", "+"его паспорт "+fourthPeople.getPassportId());
    }
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.passportId = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = 0;
    }

    public Person(int passportId) {
        this.firstName = "";
        this.lastName = "";
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
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
