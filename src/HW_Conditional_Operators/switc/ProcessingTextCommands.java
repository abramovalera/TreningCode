package HW_Conditional_Operators.switc;

import java.util.Scanner;

public class ProcessingTextCommands {
    public static void main(String[] args) {
        processingTextCommands();
    }

    public static void processingTextCommands() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        String name = scanner.nextLine();

        switch (name) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система завершена");
                break;
            case "restart":
                System.out.println("Система перезагружается");
                break;
            case "status":
                System.out.println("Система выводит статус");
                break;
            default:
                System.out.println("Что то не так ---> 500 ");
        }


    }
}
