package Zad2;

import java.util.Arrays;

public class Group {
    private Teacher teacher;
    private Student[] student;

    public Group(Teacher teacher, Student[] student) {
        this.teacher = teacher;
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public String showInfo (){
        return "Prowadzacy: " + teacher.toString() + "Uczniowie: " + Arrays.toString(student);
    }
}
