package Treningcode.Collection;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        String text = "Java is great and Java is popular";


        /**
         * Массив слов, полученный методом split().
         * Метод split принимает регулярное выражение-разделитель и возвращает массив строк.
         * В данном случае разделитель — пробел (" ").
         */
        String[] words = text.split(" ");

        /**
         * Список (List) для хранения всех слов в порядке их появления.
         * ArrayList — реализация интерфейса List.
         */
        List<String> wordList = new ArrayList<>();

/**
 * Перебор массива words и добавление каждого слова в список.
 * Метод add(E e) добавляет элемент в конец списка.
 */
        for (String w : words) {
            wordList.add(w);
        }

        System.out.println(wordList);

        /**
         * Множество (Set) уникальных слов.
         * HashSet реализует интерфейс Set и хранит только уникальные элементы.
         * Конструктор HashSet<>(Collection<? extends E> c) копирует все элементы из переданной коллекции.
         * При добавлении дубликатов они автоматически отбрасываются.
         */
        Set<String> uniqueWords = new HashSet<>(wordList);

        System.out.println(uniqueWords);

        Map<String, Integer> wordCount = new HashMap<>();

        // перебираем все слова из списка
        for (String word : wordList) {
            if (wordCount.containsKey(word)) {
                // если слово уже есть в Map, увеличиваем счётчик на 1
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                // если слова ещё нет, добавляем его с количеством 1
                wordCount.put(word, 1);
            }
        }

        // выводим Map с подсчитанными словами
        System.out.println("Количество слов (Map): " + wordCount);
    }
}