package HW_Collection.LinkedList;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Сделать отчет");
        tasks.add("Проверить почту");
        tasks.add("Позвонить начальнику");

        while (!tasks.isEmpty()) {
            String task = tasks.poll();      // берем и удаляем первую задачу
            System.out.println("Выполняю задачу: " + task);
        }
    }
}
