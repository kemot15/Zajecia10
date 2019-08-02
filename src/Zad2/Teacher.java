package Zad2;

public class Teacher extends Person {
    private double level;


    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public Teacher(String firstName, String lastName, int age, double level) {
        super(firstName, lastName, age);
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + " Poziom " + level;
    }
}
