package HW.HW_2_Class;

public class Main {
    public static void main(String[] args) {
        //1
        //создал новый экзепляр класса
        Car modelGth6 = new Car("BMW", 1996);
        //выведу значения экзепляра класса modelGth6
        modelGth6.printM();
        //изменяю год
        modelGth6.setYear(2000);
        modelGth6.printM();

        //2

        Rectangle factorio = new Rectangle(10.3, 5.6);
        factorio.printRectangle();
        factorio.setWidth(547346);
        factorio.printRectangle();

        //3

        Book shrek = new Book("Поле чудес -", "Семенов П.А.");
        shrek.printInfoBook();
        shrek.setAuthor("Бубульгум");
        shrek.printInfoBook();

        //4

        BankAccount valera = new BankAccount("Valera", 10000);
        valera.deposit(5000);
        valera.withdraw(50);
        valera.printBalance();

        //5

        Point map = new Point(7.3, 3);
        map.printMap();
        map.setX(10);
        map.printMap();

        //6
        StudentGroup class11G = new StudentGroup("11G", 22);
        class11G.printInfo();
        class11G.setStudentCount(50);
        class11G.printInfo();

        //7
        Teacher vova = new Teacher("Вова А.Ю (учитель)", "Физика");
        vova.printInfo();
        vova.setSubject("Физра");
        vova.printInfo();

        //8
        Product iphone = new Product("Iphone SE", 12000);
        iphone.printInfo();
        iphone.applyDiscount(1000);
        iphone.printInfo();

        //9
        Laptop honorUltra5 = new Laptop("Honor", 100000);
        honorUltra5.printInfo();
        honorUltra5.setPrice(99999.99);
        honorUltra5.printInfo();








    }
}
