package Zad1;

public class Director extends Employee{
    private double bonus = 0;

    public Director(String firstName, String lastName, String city, int age, double salary, String position) {
        super(firstName, lastName, city, age, salary, position);

    }

    public double getBonus() {
        return bonus;
    }

    public double totalPaymen(){
        return getSalary() + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
