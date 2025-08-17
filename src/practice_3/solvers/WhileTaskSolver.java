package practice_3.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
       //проверка метода на распечатку всех чисел от 1 до 10
    //   WhileTaskSolver.printAllNumbersBefore10();

        //проверка программы по считыванию команд пока не введут exit
        commandReader();
    }

    public static void printAllNumbersBefore10(){
        int i =1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader(){
        Scanner scanner = new Scanner(System.in);

        String command ="";

        while (!command.equals("exit")) {
            System.out.print("Введите команду:");
            command = scanner.nextLine();
        }
        System.out.println("Программа завершена");
    }
}
