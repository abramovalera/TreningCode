package HW.StreamAPI.FI_Lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainMathOperation {
    public static void main(String[] args) {
        MathOperation add = ((a, b) -> a + b);
        MathOperation subtract = ((a, b) -> a - b);
        MathOperation multiply = ((a, b) -> a * b);
        MathOperation division = ((a, b) -> a / b);

        System.out.println(add.operationSum(2,2));
        System.out.println(subtract.operationSum(2,2));
        System.out.println(multiply.operationSum(2,3));
        System.out.println(division.operationSum(4,2));


        //старый метод до Java 8
        Runnable b = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
                b.run();


        Runnable a = () -> System.out.println("Hello from anonymous class!");
        a.run();

        /**
         * x — это параметр функции (наш Integer).
         * -> — "лямбда-оператор", связывает входной параметр с телом функции.
         * x % 2 == 0 — тело функции, которое возвращает true, если число чётное, и false, Если
         */
        Predicate<Integer> isNumbers = x -> x % 2 == 0;
        System.out.println(isNumbers.test(3));

        Function<String, Integer> getLength =  x -> x.length();
        System.out.println(getLength.apply("Привет"));

        Consumer<String> printString = massage -> System.out.println(massage);
        printString.accept("Печатаю с помощью Consumer");
    }
}
