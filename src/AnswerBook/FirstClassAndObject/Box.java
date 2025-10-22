package AnswerBook.FirstClassAndObject;

public class Box {
    public static void main(String[] args) {
        Box t1 = new Box(100);
        System.out.println(t1.contains(" Кружка ") + t1.getVolume() + "мл");
    }

    int volume;

    public Box(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String contains(String item) {
        return "В коробке лежит" + item;
    }
}
