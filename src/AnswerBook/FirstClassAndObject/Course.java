package AnswerBook.FirstClassAndObject;

public class Course {
    public static void main(String[] args) {
        Course a = new Course("A", 10);
        a.printInfo();
        a.addStudent();
        a.addStudent();
        a.addStudent();
        a.addStudent();
        a.printInfo();

        Course b = new Course("B", 5);
        b.addStudent();
        b.addStudent();
        b.addStudent();
        b.printInfo();

    }
    String name;
    int StudentEnrolled;

    public Course(String name, int studentEnrolled) {
        this.name = name;
        StudentEnrolled = studentEnrolled;
    }

    public void addStudent(){
        StudentEnrolled ++;
    }
    public void printInfo(){
        System.out.println("Курс " + name + " Кол-во студентов: " + StudentEnrolled);
    }
}
