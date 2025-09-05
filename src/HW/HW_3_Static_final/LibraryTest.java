package HW.HW_3_Static_final;

public class LibraryTest {
    public static void main(String[] args) {
        Library object1 = new Library();
        //public — доступен отовсюду
        object1.category = "Сказки";
        System.out.println(object1.getCategory());

        //protected — доступен в том же пакете или в подклассах
        object1.author = "Иванов";
        System.out.println(object1.getAuthor());

        //default (без модификатора) — доступен в том же пакете
        object1.year = 25;
        System.out.println(object1.getYear());

        //private — доступен только внутри класса
        object1.setBookTitle("Хорошая книга");
        System.out.println(object1.getBookTitle());
    }
}
