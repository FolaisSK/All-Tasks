package bankApp;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Account> accounts;

    public Bank(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public Account createAccount(String name, String pin, String phoneNumber){
        Account account = new Account(name, pin, phoneNumber);
        account.setAccountNumber();
        accounts.add(account);
        return account;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Account> getAllAccounts(){
        return accounts;
    }
;
    private Account getAccountByAccountNumber(String accountNumber){
        for(Account account : accounts){
            if(account.getAccountNumber().equals(accountNumber)) return account;
        }
        return null;
    }

    private void validateAccount(Account account){
        if(account == null) throw new IllegalArgumentException("Account does not exist");
    }

    public int checkBalance(String accountNumber, String pin){
        Account foundAccount = getAccountByAccountNumber(accountNumber);
        validateAccount(foundAccount);
        return foundAccount.getBalance(pin);
    }

    public void deposit(String accountNumber, int amount){
        Account foundAccount = getAccountByAccountNumber(accountNumber);
        validateAccount(foundAccount);
        foundAccount.deposit(amount);
    }

    public void withdraw(String accountNumber, int amount, String pin){
        Account foundAccount = getAccountByAccountNumber(accountNumber);
        validateAccount(foundAccount);
        foundAccount.withdraw(amount, pin);
    }

    public void transfer(String senderAccountNumber, int amount, String pin, String receiverAccountNumber){
        Account senderAccount = getAccountByAccountNumber(senderAccountNumber);
        validateAccount(senderAccount);
        Account receiverAccount = getAccountByAccountNumber(receiverAccountNumber);
        validateAccount(receiverAccount);

        senderAccount.withdraw(amount, pin);
        receiverAccount.deposit(amount);
    }

}