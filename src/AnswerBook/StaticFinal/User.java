package AnswerBook.StaticFinal;

public class User {
    public static void main(String[] args) {
        User vanya = new User("Ваня");
        User vanya2 = new User("Ваня");

        User.printCountUser();
    }

    String name;
    public static int count;

    public User(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    static public void printCountUser() {
        System.out.println(count);
    }
}
