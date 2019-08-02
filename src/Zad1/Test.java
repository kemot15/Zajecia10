package Zad1;

public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jan", "Kowalski", "Wroclaw", 25, 256);

        Employee employee1 = new Employee("Maria","D","Lodz", 23,3000, "podstawa");

        Director director1 = new Director("Krzysztof", "Duda", "Warszawa", 34, 10000, "szef");
        director1.setBonus(500);
       // customer1.getInfo();
        customer1.toString();


    }
}
