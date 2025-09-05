package HW.Exception;

public class Task4 {
    public static void main(String[] args) {

            try {
                checkEmail("test");
            }catch (ExceptionTask4 e){
                System.out.println("Email должен содержать @");
            }
    }

    static void checkEmail(String email) {
        if (!email.contains("@")) {
            throw new ExceptionTask4("Некорректный @");
        }
    }
}
