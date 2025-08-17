package HW_Conditional_Operators.For;

public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThree();
    }

    public static void divisibleByThree() {

        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0) {
                System.out.println("Число делится на 3!" + i);
            } else {
                System.out.println("Число не делиться на 3!" + i);
            }
        }
    }
}
