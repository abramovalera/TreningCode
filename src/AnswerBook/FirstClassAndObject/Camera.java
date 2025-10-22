package AnswerBook.FirstClassAndObject;

public class Camera {
    public static void main(String[] args) {
        Camera t1 = new Camera("TP-455");
        t1.takePhoto();
    }

    String model;

    public Camera(String model) {
        this.model = model;
    }

    public void takePhoto() {
        System.out.println("Фото сделанно на " + model);
    }
}
