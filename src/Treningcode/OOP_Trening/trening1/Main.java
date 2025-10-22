package Treningcode.OOP_Trening.trening1;

/**
 * Бронирование в отеле
 * У каждого есть свой уникальный ID, цена, статус свободен\занят
 * Есть номера разных типов люкс стандартн средний
 * Номер можно бронировать\снимать бронь
 * Система должна хранить все номера и выводить функциональность по статусу всех доступных номеров
 * Распечатка тип номера, цена (которые свободные)
 */

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        Room room1 = new StandardRoom(1,110,false);
        Room room2 = new StandardRoom(2,120,false);
        Room room3 = new LuxuryRoom(3,130,false);
        Room room4 = new LuxuryRoom(4,140,false);

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);


        //бронируем

        room1.bookingRoom();
        room3.bookingRoom();
        room1.releaseRoom();
        room3.releaseRoom();

        hotel.printRoomFree();




    }
}
