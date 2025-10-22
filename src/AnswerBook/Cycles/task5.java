package AnswerBook.Cycles;

public class task5 {
    public static void main(String[] args) {
        task5.method(5);
    }

    public static void method(int count){
        if (count >= 90 & count <= 100){
            System.out.println("Отлично");
        }else if(count >= 75 & count <= 89){
            System.out.println("Хорошо");
        } else if(count >= 50 & count <= 74){
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Не удволетварительно");
        }
    }
}
