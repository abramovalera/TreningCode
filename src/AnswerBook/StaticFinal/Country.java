package AnswerBook.StaticFinal;

public class Country {
    public static void main(String[] args) {
        Country t1 = new Country("RU");
        System.out.println(t1.getCounter());
    }
    private final String counter;

    Country(String counter){
        this.counter = counter;
    }

    public String getCounter() {
        return counter;
    }
}
