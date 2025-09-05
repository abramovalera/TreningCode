package AnswerBook.FirstJavaProgram;

public class ConversionTemperatureCelsiusOfFahrenheit {
    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(2));
    }
    static double celsiusToFahrenheit(double c){
        return (c * 9/5) + 32;
    }
}
