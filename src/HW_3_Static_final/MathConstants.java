package HW_3_Static_final;

public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;

    public static double calculateCircleArea(double r){
        return PI * r * r;
    }
    public static double calculateCircumference(double r){
        return 2 * PI * r;
    }
}
