package practice_2;

public class Main {
    public static void main(String[] args) {
        // проверка конструктора по умолчанию
        Student petya = new Student(18, "Петя ");// () по умолчанию больше не действует

        petya.print();


        Student kolya = new Student(20, "Коля ");

        kolya.print();

        petya.setName("Антон ");
        petya.print();

        kolya.seaAge(21);
        kolya.print();

        // дебаг
    }
}

