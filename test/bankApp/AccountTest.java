package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    public static Account account;

    @BeforeEach
    public void initialState(){
        account = new Account();
    }

    @Test
    public void deposit5k_BalanceIs5k(){
        assertEquals(0, account.getBalance());

         account.deposit(5_000);
        assertEquals(5_000, account.getBalance());

    }

    @Test
    public void balanceIs5k_Deposit5k_BalanceIs10k(){
        assertEquals(0, account.getBalance());

        account.deposit(5_000);
        assertEquals(5_000, account.getBalance());

        account.deposit(5_000);
        assertEquals(10_000, account.getBalance());
    }

    @Test
    public void balanceIs5k_DepositMinus2k(){
        assertEquals(0, account.getBalance());

        account.deposit(5_000);
        assertEquals(5_000, account.getBalance());

        account.deposit(-2_000);
        assertEquals(5_000, account.getBalance());
    }

    @Test
    public void deposit5k_Withdraw2k_BalanceIs3k(){
        assertEquals(0, account.getBalance());

        account.deposit(5_000);
        assertEquals(5_000, account.getBalance());

        account.withdraw(2_000);
        assertEquals(3_000, account.getBalance());
    }

    @Test
    public void deposit2k_Withdraw20k_BalanceIs2k(){
        assertEquals(0, account.getBalance());

        account.deposit(2_000);
        assertEquals(2_000, account.getBalance());

        account.withdraw(20_000);
        assertEquals(2_000, account.getBalance());
    }

    @Test
    public void deposit5k_WithdrawMinus2k_BalanceIs5k(){
        assertEquals(0, account.getBalance());

        account.deposit(5_000);
        assertEquals(5_000, account.getBalance());

        account.withdraw(-2_000);
        assertEquals(5_000, account.getBalance());
    }

    @Test
    public void deposit10k_Withdraw10k_BalanceIsZero(){
        assertEquals(0, account.getBalance());

        account.deposit(10_000);
        assertEquals(10_000, account.getBalance());

        account.withdraw(10_000);
        assertEquals(0, account.getBalance());
    }


}
