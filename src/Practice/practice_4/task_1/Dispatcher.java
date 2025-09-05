package Practice.practice_4.task_1;

public class Dispatcher {
    public void control(Transport transport) {
        transport.start();
    }
    public void printTransportDetalis(Transport transport) {
        System.out.println("Скорость транспорта: " + transport.getSpeed());
        System.out.println("Вместимость транспорта: " + transport.getCapacity());
    }

}
