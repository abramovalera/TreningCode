package AnswerBook.FirstClassAndObject;

public class Student {
    public static void main(String[] args) {

        Student petya = new Student("Petya ", 5);
        petya.printStatus();
        Student kola = new Student("Kola ", 4.5);
        kola.printStatus();
    }

    String name;
    double gpa;

    public boolean isHonorsStudent(){
       return gpa >= 4.5;
    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public void printStatus(){
        if(isHonorsStudent()){
            System.out.println(name + "Отличник! ");
        } else {
            System.out.println(name + "Не отличник(((( ");
        }

    }
}
