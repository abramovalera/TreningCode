package Treningcode.algoritmtrening;
//Найти наибольшее число в массиве.
public class task4 {
    public static void main(String[] args) {
        System.out.println(method(new int[]{1,5,2,116,63,2,54,-32,1,2,1})); //116
        System.out.println(method(new int[]{1})); //116
    }

    public static int method(int[] arr){
        int max = Integer.MIN_VALUE;
        if(arr == null || arr.length == 0 || arr.length < 2) throw  new IllegalArgumentException();
       for(int i : arr){
           if(i > max){
               max = i;
           }
       }
       return max;
    }
}
