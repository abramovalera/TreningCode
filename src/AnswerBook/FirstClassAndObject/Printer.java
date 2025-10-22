package AnswerBook.FirstClassAndObject;

public class Printer {
    public static void main(String[] args) {
        Printer t1 = new Printer();
        t1.print("Приветики!");
    }

    public void print(String text){
        System.out.println("Печать: " + text);
    }
}
