package HW.Multithreading.Task3;

public class Task3 implements Runnable {

    private volatile boolean stop = false;  //volatile переменная

    @Override
    public void run() {
        while (!stop) { // Цикл выполняется, пока stop = false
            System.out.println("is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // Метод для остановки потока - должен устанавливать stop в true
    public void stop() {
        this.stop = true;
    }
}
