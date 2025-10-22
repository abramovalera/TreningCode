package AnswerBook.FirstClassAndObject;

public class Wallet {
    public static void main(String[] args) {
        Wallet t1 = new Wallet();
        t1.addMoney(10);
        System.out.println(t1.getBalance());
        t1.pay(80);
        System.out.println(t1.getBalance());
    }
    private double balance = 10.0;

    public void pay(double amount) {
        balance -= Math.min(Math.max(amount, 0), balance);
    }

    public void  addMoney(double amount){
        balance += Math.min(0,amount);
    }

    public double getBalance() {
        return balance;
    }
}
