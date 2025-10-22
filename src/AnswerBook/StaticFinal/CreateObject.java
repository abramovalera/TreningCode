package AnswerBook.StaticFinal;

class Service {
    private Service() { // приватный конструктор
        System.out.println("Создан объект Service");
    }

    public static Service create() { // фабричный метод
        return new Service();
    }

}

public class CreateObject {
    public static void main(String[] args) {
        Service s = Service.create(); // ✅ создаём объект через фабричный метод
    }
}