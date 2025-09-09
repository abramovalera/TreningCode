package AnswerBook.FirstClassAndObject;

public class Employee {
    public static void main(String[] args) {

        Employee kola = new Employee("Коля ", "Тестировщик ", 50);
        kola.describe();
        Employee nikita = new Employee("Никита ", "Сантехник ", 500);
        nikita.describe();
    }

    String name, position;
    double salary;

    public Employee(String name, String position, double salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void describe(){
        System.out.println(name + "работает как " + position + "с зарплатой: " + salary);
    }

}
