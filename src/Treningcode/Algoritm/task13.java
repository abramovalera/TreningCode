package Treningcode.Algoritm;
//Создать класс Person с полями name и age, геттерами/сеттерами и методом print()
public class task13 {
    public static void main(String[] args) {
        task13 person = new task13();
        person.print();
    }

    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println(getAge() + getName());
    }

}
