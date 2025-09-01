package AnswerBook.FirstJavaProgram;

public class RaundingNearest {
    public static void main(String[] args) {
        System.out.println(roundNearest(2.5));
    }
    static double roundNearest(double x){
        return Math.round(x);
    }
}
