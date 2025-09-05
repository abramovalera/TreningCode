package HW.Generics;

public class GenericMetod {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        String[] name = {"A", "B", "C"};

        printArray(name);
        printArray(numbers);
    }

    public static <T> void printArray(T[] nameArray) {

        for(T premennaya : nameArray){
            System.out.println(premennaya);
        }
    }

}
