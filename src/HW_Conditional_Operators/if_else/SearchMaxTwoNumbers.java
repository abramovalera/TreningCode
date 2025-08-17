package HW_Conditional_Operators.if_else;

import java.util.Scanner;

public class SearchMaxTwoNumbers {
    public static void main(String[] args) {
        searchMaxTwoNumbers();
    }
    public static void searchMaxTwoNumbers(){

        Scanner scannerA = new Scanner(System.in);
        System.out.print("Ввод: ");
        int a = scannerA.nextInt();

        Scanner scannerB = new Scanner(System.in);
        System.out.print("Ввод: ");
        int b = scannerB.nextInt();

        if (a > b){
            System.out.println("Наибольшее число: " + a);
        }else {
            System.out.println("Наибольшее число: " + b);
        }
    }
}

