package practice_3;

import practice_3.solvers.SwitchTaskSolver;
import practice_3.solvers.ifElseTaskSolver;

public class Main {
    public static void main(String[] args) {


        // проверка метода возвращаемого день недели по числу
        SwitchTaskSolver switchTaskSolver = new SwitchTaskSolver();
        System.out.println(switchTaskSolver.dayOfWeek(2));
        System.out.println(switchTaskSolver.dayOfWeek(15));

        //проверка метода по описанию сезона

        System.out.println(switchTaskSolver.describeSeason(Season.WINTER));
        System.out.println(switchTaskSolver.describeSeason(Season.AUTUM));

    }
}
