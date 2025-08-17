package HW_Conditional_Operators.if_else;

import java.util.Scanner;

public class DiscountAmountByAge {
    public static void main(String[] args) {
        discountAmountByAge();
    }

    public static void discountAmountByAge() {
        Scanner scannerA = new Scanner(System.in);
        System.out.print("Ввод: ");
        int a = scannerA.nextInt();

        if (a < 0){
            System.out.println("Возраст не может быть отрицательный!!!");
            return;
        }
        if (a > 120){
            System.out.println("Столько не живут =) введи реальный возраст");
            return;
        }

        if (a <= 18){
            System.out.println("Скидка 25%");
        } else if(a >=65){
            System.out.println("Скидка 30%");
        }else {
            System.out.println("Без скидки =(");
        }
    }
}
