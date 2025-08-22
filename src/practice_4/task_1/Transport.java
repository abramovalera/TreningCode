package practice_4.task_1;

public abstract class Transport {
    protected double speed; // км/ч
    protected int capacity; // км3

    public Transport(int speed, int capacity){
        this.speed = speed;
        this.capacity = capacity;
    }

    public double getSpeed() {
        return this.speed;
    }

    public int getCapacity() {
        return this.capacity;
    }

    abstract void start();
}
