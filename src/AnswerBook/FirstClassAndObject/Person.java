package AnswerBook.FirstClassAndObject;

public class Person {
    public static void main(String[] args) {
        Person person1 = new Person("Vova", "Boba");
        System.out.println(person1.getFullName());
    }

    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
