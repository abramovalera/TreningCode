package HW.HW_Conditional_Operators.switc;

import java.util.Scanner;

public class TicketPriseOfWeek {
    public static void main(String[] args) {
ticketPriseOfWeek();
    }
    public static void ticketPriseOfWeek(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        int day = scanner.nextInt();


        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Стоимость 300 руб.");
                break;
            case 6:
            case 7:
                System.out.println("Стоимость 450 руб.");
                break;
            default:
                System.out.println("Нету такого дня!");
        }
    }
}
