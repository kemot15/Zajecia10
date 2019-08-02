package Zad1;

public class Customer extends Person {
    private double expenses;
  //  private int level;


    public Customer(String firstName, String lastName, String city, int age, double expenses) {
        super(firstName, lastName, city, age);
        this.expenses = expenses;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public void getInfo (){
        System.out.println("Imie: " + getFirstName()
                + "\nNazwisko: " + getLastName()
                + "\nMiasto: " + getCity());
    }

    @Override
    public String toString() {
        return  super.toString() + "Wydatki: " + expenses;

    }
}
