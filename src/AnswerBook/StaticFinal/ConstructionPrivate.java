package AnswerBook.StaticFinal;

public class ConstructionPrivate {
    public static void main(String[] args) {

        ConstructionPrivate s1 = ConstructionPrivate.create();
    }

    private ConstructionPrivate() {
        System.out.println("Создан объект");
    }

    public static ConstructionPrivate create() {
        return new ConstructionPrivate();
    }
}
