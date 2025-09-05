package Treningcode.collection;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Valera");
        students.add("Ola");
        students.add("Petya");
        students.add("Kola");
        students.add("Nastya");


        System.out.println("Список студентов: ");
        // : читается как "Для каждого" или "в".
        for(String student : students){
            System.out.println(" - " + student);
        }

        students.remove("Ola");
        students.remove(0);

        if(students.contains("Ola")){
            System.out.println("Ola Такой есть студент!");
        }else {
            System.out.println("Ola Такого студента нет!");
        }

    }
}
