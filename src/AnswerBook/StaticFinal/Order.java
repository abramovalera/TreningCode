package AnswerBook.StaticFinal;

public class Order {
    public static void main(String[] args) {
        Order t1 = new Order();
        Order t2 = new Order();
        Order t3 = new Order();
        System.out.println(t1.getId());
        System.out.println(t2.getId());
        System.out.println(t3.getId());
    }

    private static int count = 0;
    private final int id;

    public Order() {
        count++;
        this.id = count;
    }

    public int getId() {
        return id;
    }
}
