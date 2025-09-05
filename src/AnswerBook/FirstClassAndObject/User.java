package AnswerBook.FirstClassAndObject;

public class User {
    public static void main(String[] args) {
        User user1 = new User("Oleg", 21);
        user1.introduce();
    }

    String username;
    int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Привет, меня зовут " + username + " мне " + age);
    }
}
