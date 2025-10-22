package Treningcode.OOP_Trening.trening4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<Item> list = new ArrayList<>();

    public void addItem(Item item){
        list.add(item);
    }

    public void printFullMenu(){
        for (Item i : list){
            i.printInfo();
        }
    }
}
