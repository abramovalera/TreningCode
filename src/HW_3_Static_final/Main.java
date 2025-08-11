package HW_3_Static_final;

public class Main {
    public static void main(String[] args) {
//Класс Company
        Company petya = new Company(1, "Петя");
        Company kolya = new Company(2, "Коля");

        Company.printCompanyName();
        Company.companyName = "Дикси";
        Company.printCompanyName();

        //     petya.employeeId =13;  Попробуйте изменить employeeID — должно быть невозможно.

        //Класс MathConstants
        System.out.println("Площадь: " + MathConstants.calculateCircleArea(10));
        System.out.println("Радиус: " + MathConstants.calculateCircumference(5));

        System.out.println("Площадь: " + MathConstants.calculateCircleArea(12));
        System.out.println("Радиус: " + MathConstants.calculateCircumference(7));


        //Класс Library — модификаторы доступа

        University vova = new University("Вовчик", 1);
        University valera = new University("Валера", 2);
        University nikita = new University("Никита", 3);

        vova.printStudentInfo();
        valera.printStudentInfo();
        nikita.printStudentInfo();

        University.changeUniversityName("Крутой уник");

        vova.printStudentInfo();
        valera.printStudentInfo();
        nikita.printStudentInfo();

//Класс GameSettings

        GameSettings player1 = new GameSettings(100,"Need for Speed");
        GameSettings player2 = new GameSettings(45,"Minecraft");

        player1.print_();


        player1.printGameStatus();
        player2.printGameStatus();

        player1.print_();

        GameSettings.setMaxPlayers(200);
        player1.printGameStatus();
        player2.printGameStatus();

        //Класс Person

        Person olga = new Person("Ольга", "Зубцова", "4523-df-3244");
        Person masha = new Person("Мария", "Беляева", "5456-mkl-6678");

        olga.print_();

        olga.printPersonInfo();
        masha.printPersonInfo();

        olga.setFirstName("Екатерина");

        olga.print_();

        olga.printPersonInfo();
        masha.printPersonInfo();









    }
}
