package bankApp;

public interface InterBankTransfer {
    void transfer(String senderAccountNumber, int amount, String pin, String receiverBank, String receiverAccountNumber);
}
