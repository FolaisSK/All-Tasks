package bankApp;

public class Account {
    private String name;
    private String pin;
    private int balance;
    private String phoneNumber;
    private String number;

    public Account(String name,String pin, String phoneNumber) {
        validateName(name);
        this.name = name;
        this.pin = pin;
        this.phoneNumber = phoneNumber;
    }

    public int getBalance(String pinNumber){
        if(pinNumber.equals(pin))
            return balance;
        else
            return 0;
    }

    public void deposit(int amount) {
        validatePositiveAmount(amount);
        balance = balance + amount;
    }

    public void withdraw(int amount, String pinNumber) {
        validatePin(pinNumber);
        validateAmount(amount);
        validatePositiveAmount(amount);
        balance = balance - amount;
    }

    private String generateAccountNumber(){
        validatePhoneNumber();
        return phoneNumber.substring(1);
    }

    public void setAccountNumber() {
        this.number = generateAccountNumber();
    }

    public String getAccountNumber(){
        return this.number;
    }

    private void validatePhoneNumber(){
        if(phoneNumber.length() != 11) throw new IllegalArgumentException("Invalid Phone Number");
    }

    private void validatePin(String pinNumber){
        if(!pinNumber.equals(pin)) throw new IllegalArgumentException("Invalid Pin");
    }

    private void validateAmount(int amount){
        if(amount > balance) throw new IllegalArgumentException("Insufficient Funds");
    }

    private void validatePositiveAmount(int amount){
        if(amount <= 0) throw new IllegalArgumentException("Invalid Amount");
    }

    private String validateName(String name){
        if(name.trim().isEmpty()) throw new IllegalArgumentException("What kind of name is that");
        return name;
    }
}