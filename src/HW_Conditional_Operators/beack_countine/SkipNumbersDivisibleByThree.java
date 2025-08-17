package HW_Conditional_Operators.beack_countine;

public class SkipNumbersDivisibleByThree {
    public static void main(String[] args) {
        skipNumbersDivisibleByTrhee();
    }

    public static void skipNumbersDivisibleByTrhee() {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
