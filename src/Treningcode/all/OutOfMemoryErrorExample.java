package Treningcode.all;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        while (true) {
            list.add(new byte[1024 * 1024]);
        }
    }

}
