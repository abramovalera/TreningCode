package HW.HW_Conditional_Operators.if_else;

import java.util.Scanner;

public class WhoIsNumber {
    public static void main(String[] args) {
        whoIsNumber();
    }
    public static void whoIsNumber(){
        //сканер
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        //условие
        if(a > 0){
            System.out.println("Число положительное");
        }else if(a < 0){
            System.out.println("Число отрицательное");
        }else {
            System.out.println("Равно нулю");
        }
    }
}
