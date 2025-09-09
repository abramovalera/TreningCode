package AnswerBook.FirstClassAndObject;

public class Car {
    public static void main(String[] args) {
        Car bmw = new Car("BMW F90", 65000);
        bmw.printMileage();
        bmw.drive(5000);
        bmw.printMileage();
        bmw.drive(5000);
        bmw.printMileage();
    }

    String brand;
    int mileage;

    public Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public int drive(int km){
       return mileage = mileage + km;
    }

    public void printMileage(){
        System.out.println("Текущий пробег: " + brand + " " + mileage);
    }
}
