package Practice.Multithreads.multithreads;

public class ThreadSum implements Runnable {
    private final int[] array; //массив
    private final int start; // начало массива
    private final int end; //конец массива
    private int sum = 0;

    //принимаем на вход сам массив начало и конец
    public ThreadSum(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    public int getSum() {
        return this.sum;
    }
}