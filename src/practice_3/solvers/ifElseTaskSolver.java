package practice_3.solvers;

public class ifElseTaskSolver {
    public static void main(String[] args) {
        ifElseTaskSolver ifElseTaskSolver = new ifElseTaskSolver();

        //Проверка метода четности
              System.out.println(ifElseTaskSolver.checkParity(4));
        System.out.println(ifElseTaskSolver.checkParity(7));

        //проверка метода определения возраста
        System.out.println(ifElseTaskSolver.checkAge(4));
        System.out.println(ifElseTaskSolver.checkAge(21));
        System.out.println(ifElseTaskSolver.checkAge(71));

        //проверка метода по нахождению max среди 3 чисел
        System.out.println(ifElseTaskSolver.checkMax(3,7,5));

    }
    /**
     * Метод для проверки четности числа
     *
     * @param number
     * @return
     */
    public static String checkParity(int number) {
        //if -else
        // number % 2 == 0 --- четное
        // number % 2 == 1 --- не четное
        // number =2; 2 % 2 == 0  четное
        // number =7; 7 % 2 == 1  не четное


        String parity = "Нечетное";

        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }

    public static String checkAge(int age) {
        String ageDescription = "";
        if (age < 18) {
            ageDescription = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60) {
            ageDescription = "Взрослый";
        }
        if (age > 60) {
            ageDescription = "Пожилой";
        }
        return ageDescription;
    }
    public int checkMax(int a, int b, int c){
        int maxAB = b;
        if (a > b) {
            maxAB = a;
        }
        int max = maxAB;
        if(c > maxAB){
         max = c;
        }
        return max;
    }
}
