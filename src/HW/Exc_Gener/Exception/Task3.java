package HW.Exc_Gener.Exception;

public class Task3 {
    public static void main(String[] args) {
        try {
            checkAge(170);
        } catch (ExceptionTask3 e) {
            System.out.println("Ошибка!");
        }
    }

    static void checkAge(int age) throws ExceptionTask3 {
        if (age < 0 || age > 150) {
            throw new ExceptionTask3("Не верный возраст!");
        }
    }
}
