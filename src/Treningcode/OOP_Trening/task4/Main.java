package Treningcode.OOP_Trening.task4;

/**
 * Создай классы Student и Group.
 * Student содержит имя и оценки.
 * Group хранит список студентов и считает средний балл.
 */

public class Main {
    public static void main(String[] args) {
        Group a1 = new Group();
        Student petya = new Student("Петя", 10);
        Student vasa = new Student("Вася", 12);
        Student kola = new Student("Коля", 15);

        a1.addStudent(petya);
        a1.addStudent(vasa);
        a1.addStudent(kola);

        a1.printStudent();

        System.out.println(a1.avgScore());


    }
}
