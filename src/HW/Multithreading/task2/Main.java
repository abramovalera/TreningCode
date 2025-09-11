package HW.Multithreading.task2;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Class1());
        Thread t2 = new Thread(new Class2());

        t1.start();
        t2.start();


    }
}
