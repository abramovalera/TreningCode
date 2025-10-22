package Treningcode.OOP_Trening.trening1;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    List<Room> rooms = new ArrayList<>();


    public void addRoom(Room room) {
        rooms.add(room);

    }

    public void printRoomFree() {
        for (Room room : rooms) {
            if (!room.isBooked()) {
                System.out.println("Номер комнаты: " + room.getId() +" | " +  "Цена: " + room.getPrise() + " | " + room.getType());
            }
        }
    }
}


