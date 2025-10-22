package AnswerBook.StaticFinal;

public class BankAccount {
    public static void main(String[] args) {
        BankAccount t1 = new BankAccount();
        t1.deposit(100);
        t1.withdraw(50);
        System.out.println(t1.getBalance());
    }
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance = Math.max(0, balance - amount);

    }
}
