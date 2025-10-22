package AnswerBook.StaticFinal;

public class CheckNoObject {
    public static void main(String[] args) {
        System.out.println(CheckNoObject.check(1));
    }

    static String check(int amount){
        return amount % 2 == 0 ? "Четное" : "Нечетное";
    }
}
