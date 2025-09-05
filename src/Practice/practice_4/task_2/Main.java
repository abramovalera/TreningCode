package Practice.practice_4.task_2;

public class Main {
    public static void main(String[] args) {
        Item mug = new Item("Кружка", 100, 2);
        Item microphone = new Electronics("Микрофон", 10000, 5);
        Item dress = new Clother("Платье", 5000, 4);

        Manager kostya = new Manager();

        kostya.manage(mug);
        kostya.manage(microphone);
        kostya.manage(dress);
    }
}
