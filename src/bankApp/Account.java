package bankApp;

public class Account {
    private int balance;
    private final int pinNumber = 1234;

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0)
            balance = balance + amount;

    }

    public void withdraw(int amount) {
        if(amount > 0 && amount <= balance)
            balance = balance - amount;
    }

/*
    public boolean inputPin(int userInput) {
       if(userInput == pinNumber)
           return true;
        return false;
    }**/
}