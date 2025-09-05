package AnswerBook.FirstClassAndObject;

public class Phone {
    public static void main(String[] args) {
       Phone phone1 = new Phone("Iphone", 100);
       phone1.call("911");
    }

    String model;
    int batteryLevel;

    public Phone(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    public void call(String number){
        System.out.println("Звоню на номер -> " + number + " с телефона " + model);
    }









}
