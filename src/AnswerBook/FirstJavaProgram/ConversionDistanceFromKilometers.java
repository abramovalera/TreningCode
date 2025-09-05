package AnswerBook.FirstJavaProgram;

public class ConversionDistanceFromKilometers {
    public static void main(String[] args) {
        System.out.println(kmToMiles(100));
    }

    static double kmToMiles(double km) {
        return km * 0.621371;
    }
}
