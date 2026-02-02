package bankApp;

public class Account {
    private int pin;
    private int balance;

    public Account(int pin) {
        this.pin = pin;
    }

    public int getBalance(int pinNumber){
        if(pinNumber == pin)
            return balance;
        else
            return 0;
    }

    public void deposit(int amount) {
        if(amount > 0)
            balance = balance + amount;

    }

    public void withdraw(int amount, int pinNumber) {
        if(pinNumber == pin && amount > 0 && amount <= balance)
            balance = balance - amount;
    }

}