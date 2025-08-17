package HW_Conditional_Operators.do_while;

import java.util.Scanner;

public class ExitProgram {
    public static void main(String[] args) {
        exitProgram();
    }

    public static void exitProgram() {

        Scanner scanner = new Scanner(System.in);
        String password = "exit";
        String a;

        do {
            System.out.print("Ввод: "); // вводим
            a = scanner.nextLine(); //  присвоили 123 = а/
        } while (!a.equals(password));
        System.out.println("Верно!");


    }
}
