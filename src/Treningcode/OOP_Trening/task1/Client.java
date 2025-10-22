package Treningcode.OOP_Trening.task1;


class Client {
    private final String id;      // уникальный идентификатор
    private double balance;       // баланс

    public Client(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Недостаточно средств у клиента " + id);
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
