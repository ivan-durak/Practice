package ru.ssau.tk.dmitriy.practice;

public class NamedPoint extends Point implements Resettable {
    private String name;

    public NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    public NamedPoint(double givenX, double givenY, double givenZ) {
        super(givenX, givenY, givenZ);
    }

    public NamedPoint(double givenX, double givenY, double givenZ, String name) {
        super(givenX, givenY, givenZ);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void reset() {
        name = "Absent";
    }

    @Override
    public String toString() {
        if (name == null) {
            return super.toString();
        }
        return name.concat(" ") + super.toString();
    }
}
