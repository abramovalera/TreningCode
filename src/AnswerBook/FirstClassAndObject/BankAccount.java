package AnswerBook.FirstClassAndObject;

public class BankAccount {
    public static void main(String[] args) {
        BankAccount bankOTP = new BankAccount(150.25);
        bankOTP.printBalance();
        bankOTP.deposit(50);
        bankOTP.printBalance();
        bankOTP.withdraw(200);
        bankOTP.printBalance();
        bankOTP.withdraw(200);
    }

    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    public void printBalance() {
        System.out.println(balance);
    }
}
