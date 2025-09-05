package Practice.practice_3.solvers;

public class ForTaskSolver {
    public static void main(String[] args) {
        //проверка таблицы умножения
      //  multiplayTable(5);

        //проверка суммы всех чисел
        System.out.println(sumOfAllNumber(10));
    }

    public static void multiplayTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    number + " x " + "= " + number * i);
        }
    }
    public static int sumOfAllNumber(int n){
        int sum = 0;

        //шаг 1 - sum =0; i = 1 --- sum = 1
        //шаг 2 - sum =2; i = 2 --- sum = 3
        //шаг 3 - sum =3; i = 3 --- sum = 6
        //шаг 4 - sum =6; i = 1 --- sum = 10
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void checkNumberIsSimple(){

    }
}
