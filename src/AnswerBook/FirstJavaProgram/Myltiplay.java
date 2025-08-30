package AnswerBook.FirstJavaProgram;

public class Myltiplay {
    public static void main(String[] args) {
        Myltiplay myltiplayNumbers = new Myltiplay();
        int result = myltiplayNumbers.multiplay(7, 8);
        System.out.println(result);
    }

    public int multiplay(int a, int b) {
        return a * b;
    }
}
