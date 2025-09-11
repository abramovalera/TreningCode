package HW.Multithreading.Task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Task3 task1 = new Task3(); // создаем объект ранбл
        Thread t1 = new Thread(task1); // обворачиваем
        t1.start(); // запускаем поток

        Thread.sleep(2000);

        task1.stop();
    }
}
