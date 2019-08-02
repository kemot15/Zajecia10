package Zad2;

public class Student extends Person {
    private String city;

    public Student(String firstName, String lastName, int age, String city) {
        super(firstName, lastName, age);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return super.toString() + " Miasto " + city;
    }
}
