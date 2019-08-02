package Zad2;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jan", "Kowalski", 56, 7);
        Student student1 = new Student("Krzys", "Duda", 23, "Wroclaw");
        Student student2 = new Student("Patryk", "Cichy", 34, "Poznan");
        Student[] studentsGroup = {student1, student2};
        Group group1 = new Group(teacher1, studentsGroup);
        System.out.println(group1.showInfo());
        System.out.println(student1.toString());
    }
}
