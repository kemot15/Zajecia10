package Zad4;

import java.sql.SQLOutput;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString (){
        return "Imie: " + firstName
                + "\nNazwisko: " + lastName;
    }

    public void showInfo (){
        System.out.println(toString());
    }
}
