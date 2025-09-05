package AnswerBook.FirstJavaProgram;

public class ConversionMinutesOfHours {
    public static void main(String[] args) {
        System.out.println(minutesToHours(140));
    }

    static double minutesToHours(int minutes) {
        return minutes / 60.0;
    }
}
