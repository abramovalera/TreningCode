package HW.Generics;

public class Pair<T, A> {
    private T first;
    private A second;

    public Pair(A second, T first) {
        this.second = second;
        this.first = first;
    }

    public void setSecond(A second) {
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getFirst() {
        return first;
    }

    public A getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>("Привет",2);

        System.out.println(pair.getSecond());
        System.out.println(pair.getFirst());

        Pair<Integer, Integer> pair1 = new Pair<>(10,200);

        System.out.println(pair1.getSecond());
        System.out.println(pair1.getFirst());

        Pair<String, String> pair2 = new Pair<>("GDF","FFF");

        System.out.println(pair2.getSecond());
        System.out.println(pair2.getFirst());


    }

}





