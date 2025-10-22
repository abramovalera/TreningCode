package AnswerBook.StaticFinal;

public class Person {
    public static void main(String[] args) {
        Person vasya = new Person();
        vasya.setAge(15);
        System.out.println(vasya.getAge());
    }

    private int age;

    public void incrementAge() {
        age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
