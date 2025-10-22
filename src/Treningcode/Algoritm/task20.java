package Treningcode.Algoritm;
//Проверить, можно ли строку безопасно преобразовать в число
//Integer.parseInt(value)
public class task20 {
    public static void main(String[] args) {
        System.out.println(isMethod("123"));
    }

    public static boolean isMethod(String s) {

        try {
           Integer.parseInt(s);
           return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}
