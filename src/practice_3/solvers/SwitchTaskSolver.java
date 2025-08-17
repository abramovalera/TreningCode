package practice_3.solvers;

import practice_3.Season;

public class SwitchTaskSolver {
    public String dayOfWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Такого дня нет";
        }
        return dayOfWeek;
    }

    public String describeSeason(Season season){
        String description = "";
        switch (season){
            case WINTER -> description = "Зима холодно - снежно";
            case SUMMER -> description = "Лето Лето";
            case SPRING -> description = "Весна Все цветет";
            case AUTUM -> description = "Осень День рождение";
        }
        return description;
    }

}
