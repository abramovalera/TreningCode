package HW.Exc_Gener.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1 {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла нет!");
        }
    }
}
