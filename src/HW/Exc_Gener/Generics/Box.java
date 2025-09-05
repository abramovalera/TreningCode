package HW.Generics;

public class Box<T> {
    private T item; // тут храним объект любого типа
    public static void main(String[] args) {

        Box<String> boxString = new Box<>();
        boxString.set("Строка");// ложим строку
        System.out.println(boxString.get());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.set(3);
        System.out.println( boxInteger.get());

    }
    public void set(T item){
        this.item = item;
    }

    private T get(){
        return item;
    }
}
