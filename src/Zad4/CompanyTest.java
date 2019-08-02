package Zad4;

public class CompanyTest {
    public static void main(String[] args) {
        Person person1 = new Employee("Krzyszto", "Kolumb", 4500);
        Person person2 = new Director("Jerzy", "Kowalski", 6000, 2000);
        Person[] company = {person1, person2};

        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Jan", "Kowalski", 2000);
        employees[1] = new Director("Jan", "Nowak", 4500, 200);

        for (Employee emp: employees){
            emp.showInfo();

        }

        for (int i = 0; i < company.length; i++){

            System.out.println(company[i].toString());
        }

        double totalSalary = 0;

        for (Employee emp: employees) {
            totalSalary += emp.totalSalary();

        }
        System.out.println("Suma: " + totalSalary);

        System.out.println(count(employees, 200));


    }

    private static  int count (Employee[]employees, double max){
        int count = 0;
        for (Employee emp: employees) {
            if(emp.totalSalary() > max){
                count++;
            }

        }
        return count;
    }
}
