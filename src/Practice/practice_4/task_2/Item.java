package Practice.practice_4.task_2;

public class Item implements Printabl{
    private String name;
    private double price;
    private int count;

    public Item(String name, double price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }


    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void print() {
        System.out.print("Мой товар: имя " + this.name +
                ", цена " + this.price +
                ", количество " + this.count);
    }
}
