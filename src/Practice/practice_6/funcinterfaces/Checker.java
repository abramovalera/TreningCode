package Practice.practice_6.funcinterfaces;


@FunctionalInterface
public interface Checker {
    // Интерфейс проверят удовлетворяет ли число условию
    // Метод по умолчанию печатает число если оно подходит проверку

    boolean check(int number);

    default  void printIfValid(int number){
        if (check(number)){
            System.out.println(number);
        }
    }
}
