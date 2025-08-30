package AnswerBook.FirstJavaProgram;

public class RemainderOfDivision {
    public static void main(String[] args) {
        RemainderOfDivision remainderOfDivisions = new RemainderOfDivision();
        System.out.println(remainderOfDivisions.modulus(10, 100));
    }

    public int modulus(int a, int b) {
        return a % b;
    }
}
