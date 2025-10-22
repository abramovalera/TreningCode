package Treningcode.OOP_Trening.task4;

/**
 * Student содержит имя и оценки.
 */
public class Student {

    private String studentName;
    private int score;

    public Student(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getScore() {
        return score;
    }
}
