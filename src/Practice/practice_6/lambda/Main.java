package Practice.practice_6.lambda;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет");
            }
        };
        r1.run();

        // современный вариант

        Runnable r2 = () -> System.out.println("Привет");
        r2.run();
    }
}
