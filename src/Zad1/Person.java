package Zad1;

public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private int age;

    public Person(String firstName, String lastName, String city, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString (){
        return  "Imie: " + firstName
                + "\nNazwisko: " + lastName
                + "\nMiasto: " + city
        + "\nWiek: " + age;

    }

}
