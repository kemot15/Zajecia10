package Zad1;

public class Employee extends Person {
    private double salary;
    private String position;

    public Employee(String firstName, String lastName, String city, int age, double salary, String position) {
        super(firstName, lastName, city, age);
        this.salary = salary;
        this.position = position;
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return  super.toString() + "wynagrodzenie: " + salary;
    }
}
