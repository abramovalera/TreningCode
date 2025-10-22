package Treningcode.OOP_Trening.trening3_no;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Item> items = new ArrayList<>();


    public void addItem(Item item){
        items.add(item);
    }

    public void printInfo(){
        for(Item i : items){
        }
    }
}
