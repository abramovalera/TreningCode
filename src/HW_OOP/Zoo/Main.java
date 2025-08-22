package HW_OOP.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zooMoscow = new Zoo();

        Elephant slon1 = new Elephant();
        zooMoscow.addAnimal(slon1);
        zooMoscow.showMakeSound();
        zooMoscow.showMakeMove();

        Bird calibri = new Bird();
        zooMoscow.addAnimal(calibri);
        zooMoscow.showMakeSound();
        zooMoscow.showMakeMove();


    }
}
