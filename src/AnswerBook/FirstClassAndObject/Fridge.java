package AnswerBook.FirstClassAndObject;

public class Fridge {
    public static void main(String[] args) {
        Fridge honor = new Fridge();
        honor.setTemperature(5);
        System.out.println( honor.getStatus());

        Fridge lg = new Fridge();
        lg.setTemperature(4);
        System.out.println(lg.getStatus());
    }

    private int temperature;

    public void setTemperature(int t) {
        temperature = t;
    }

    public String getStatus() {
        return "Холодильник охлаждается при " + temperature + " градусах";
    }
}
