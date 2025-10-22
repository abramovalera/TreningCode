package Treningcode.OOP_Trening.task1;

public class Main {
    public static void main(String[] args) {

        Client vova = new Client("231", 300);
        Client kola = new Client("654", 300);
        Transfer swift = new SwiftTransfer();

        swift.transfer(vova, kola, 1);

    }
}
