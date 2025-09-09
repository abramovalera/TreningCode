package AnswerBook.FirstClassAndObject;

public class Table {
    public static void main(String[] args) {

        Table table = new Table("Дуб", 12, 10);
        table.describe();
    }

    int width, height;
    String material;


    Table(String material, int width, int height){
        this.material = material;
        this.height = height;
        this.width = width;
    }

    public void describe() {
        System.out.println("Стол из " + material + ", размер " + width + " x " + height);
    }
}
