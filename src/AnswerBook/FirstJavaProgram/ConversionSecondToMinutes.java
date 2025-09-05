package AnswerBook.FirstJavaProgram;

public class ConversionSecondToMinutes {
    public static void main(String[] args) {
        System.out.println(secondsToMinutes(130));
    }

    static double secondsToMinutes(int seconds) {
        return seconds / 60.0;
    }
}
