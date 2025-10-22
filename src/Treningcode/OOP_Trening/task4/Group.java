package Treningcode.OOP_Trening.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Group хранит список студентов и считает средний балл.
 */
public class Group {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        if (!students.contains(student)) {
            throw new RuntimeException("Студент не добавлен в список");
        }
        students.remove(student);
    }

    public void printStudent() {
        for (Student s : students) {
            System.out.println(s.getStudentName() + ", " + s.getScore());
        }
    }

    public double avgScore() {
        if (students.isEmpty()) {
            throw new RuntimeException("Нету студентов в группе");
        }
        int sum = 0;
        for (Student s : students) {
            sum += s.getScore();

        }
        return (double) sum / students.size();

    }
}

