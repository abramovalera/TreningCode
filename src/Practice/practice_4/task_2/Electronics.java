package Practice.practice_4.task_2;

public class Electronics extends Item {
    private int garantee;
    private final static int DEFAULT_GARANTEE = 2;

    public Electronics(String name, double price, int count) {
        super(name, price, count);
        this.garantee = DEFAULT_GARANTEE;

    }

    public int getGarantee() {
        return garantee;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", гарантия " + this.garantee + " года");
    }
}

