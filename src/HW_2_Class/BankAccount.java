package HW_2_Class;

//deposit - значит занести на счет денег
//Например: положить на счет 500 р -> balance=balance + 500
//
//withdraw - значит cнять деньги  со счета
//Например: снять со счета 500 р -> balance=balance - 500
public class BankAccount {
    String owner;
    double balance;
    //Конструктор
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // гетер для owner
    public String getOwner() {
        return this.owner;
    }
    // гетер для баланса
    public double getBalance() {
       return this.balance;
    }

    // Метод внесения денег - увиличивает баланс
    public void deposit (double amount){
        balance = balance + amount;
    }
    // Метод вывода денег - уменьшает баланс
    public void withdraw (double amount){
        balance = balance - amount;
    }
    public void printBalance(){
        System.out.println("Текущий баланс: " + balance);
    }
}
