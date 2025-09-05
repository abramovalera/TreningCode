package HW.HW_Conditional_Operators.While;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
      reverseNumbers();
    }
    public static void reverseNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод: ");
        int number = scanner.nextInt();


        while (number >= 1){
            System.out.println(number);
            number --;
        }
    }
}
