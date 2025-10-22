package AnswerBook.Cycles;

public class task1 {
    public static void main(String[] args) {
        System.out.println(task(2));
    }

    public static String task(int a) {
         return a % 2 == 0 ? "четное" : "не четное";
    }

}
