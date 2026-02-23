package bankApp;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank("SK Bank");
    }

    @Test
    void testThatAccountCanBeCreated() {
        Account account = bank.createAccount("Fola", "1234", "08012345678");

        assertNotNull(account);
        assertEquals("SK Bank", bank.getName());
        assertEquals(1, bank.getAllAccounts().size());
    }

    @Test
    void testToDeposit5k_BalanceIs5k() {
        Account account = bank.createAccount("Fola", "1234", "08012345678");
        String accountNumber = account.getAccountNumber();

        bank.deposit(accountNumber, 5000);

        assertEquals(5000, bank.checkBalance(accountNumber, "1234"));
    }

    @Test
    void testToDeposit5k_Withdraw2k_BalanceIs3k() {
        Account account = bank.createAccount("Fola", "1234", "08012345678");
        String accountNumber = account.getAccountNumber();

        bank.deposit(accountNumber, 5000);
        bank.withdraw(accountNumber, 2000, "1234");

        assertEquals(3000, bank.checkBalance(accountNumber, "1234"));
    }

    @Test
    void testThatWithdrawWithWrongPinThrowsException() {
        Account account = bank.createAccount("Fola", "1234", "08012345678");
        String accountNumber = account.getAccountNumber();

        bank.deposit(accountNumber, 5000);

        assertThrows(IllegalArgumentException.class,
                () -> bank.withdraw(accountNumber, 2000, "0000"));
    }

    @Test
    void testThatAccountXDeposits10k_Transfer4kToAccountY_BalanceIs6kInX_BalanceIs4kInY() {
        Account sender = bank.createAccount("Fola", "1234", "08012345678");
        Account receiver = bank.createAccount("Tobi", "5678", "08087654321");

        String senderAccountNumber = sender.getAccountNumber();
        String receiverAccountNumber = receiver.getAccountNumber();

        bank.deposit(senderAccountNumber, 10000);

        bank.transfer(senderAccountNumber, 4000, "1234", receiverAccountNumber);

        assertEquals(6000, bank.checkBalance(senderAccountNumber, "1234"));
        assertEquals(4000, bank.checkBalance(receiverAccountNumber, "5678"));
    }

    @Test
    void testThatTransferThrowsExceptionWithWrongPin() {
        Account sender = bank.createAccount("Fola", "1234", "08012345678");
        Account receiver = bank.createAccount("Tobi", "5678", "08087654321");

        String senderAccountNumber = sender.getAccountNumber();
        String receiverAccountNumber = receiver.getAccountNumber();

        bank.deposit(senderAccountNumber, 10000);

        assertThrows(IllegalArgumentException.class, () -> bank.transfer(senderAccountNumber, 4000, "0000", receiverAccountNumber));
    }

    @Test
    void testThatCheckBalanceThrowsExceptionIfAccountDoesNotExist() {
        assertThrows(IllegalArgumentException.class, () -> bank.checkBalance("99999", "1234"));
    }

    @Test
    void testThatDepositThrowsExceptionIfAccountDoesNotExist() {
        assertThrows(IllegalArgumentException.class, () -> bank.deposit("99999", 5000));
    }
}


