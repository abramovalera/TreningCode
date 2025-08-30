package AnswerBook.FirstJavaProgram;

public class DifferenceTwoNumbers {
    public static void main(String[] args) {
        DifferenceTwoNumbers difference = new DifferenceTwoNumbers();
        int result = difference.subtract(10,2);
        System.out.println(result);
    }
    public int subtract (int a, int b){
        return a - b;
    }
}
