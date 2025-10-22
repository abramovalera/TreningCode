package AnswerBook.Cycles;

public class task7 {
    public static void main(String[] args) {
        task7.method(20);
    }

    public static void method(int number){

        for(int i = 0; i <= number; i++){
            if (i % 2 ==0){
                System.out.println(i);
            }

        }
    }
}
