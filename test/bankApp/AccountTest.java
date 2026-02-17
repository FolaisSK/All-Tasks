package bankApp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    Account account;
    Account accountTwo;

    @BeforeEach
    public void initialState(){
        account = new Account("Fola","1234", "09079368997");
        accountTwo = new Account("Dave","1111", "08145678912");
    }


    @Test
    public void deposit5k_BalanceIs5k(){
        assertEquals(0, account.getBalance("1234"));

         account.deposit(5_000);
        assertEquals(5_000, account.getBalance("1234"));

    }

    @Test
    public void balanceIs5k_Deposit5k_BalanceIs10k(){
        assertEquals(0, account.getBalance("1234"));

        account.deposit(5_000);
        assertEquals(5_000, account.getBalance("1234"));

        account.deposit(5_000);
        assertEquals(10_000, account.getBalance("1234"));
    }

    @Test
    public void balanceIs5k_DepositMinus2k_BalanceIsStill5k(){
        assertEquals(0, account.getBalance("1234"));

        account.deposit(5_000);
        assertEquals(5_000, account.getBalance("1234"));

        account.deposit(-2_000);
        assertEquals(5_000, account.getBalance("1234"));
    }

    @Test
    public void deposit5k_Withdraw2k_BalanceIs3k(){
        assertEquals(0, account.getBalance("1234"));

        account.deposit(5_000);
        assertEquals(5_000, account.getBalance("1234"));

        account.withdraw(2_000, "1234");
        assertEquals(3_000, account.getBalance("1234"));
    }

    @Test
    public void deposit2k_Withdraw20k_BalanceIsStill2k(){
        assertEquals(0, account.getBalance("1234"));

        account.deposit(2_000);
        assertEquals(2_000, account.getBalance("1234"));

        account.withdraw(20_000, "1234");
        assertEquals(2_000, account.getBalance("1234"));
    }

    @Test
    public void deposit5k_WithdrawMinus2k_BalanceIsStill5k(){
        assertEquals(0, account.getBalance("1234"));

        account.deposit(5_000);
        assertEquals(5_000, account.getBalance("1234"));

        account.withdraw(-2_000, "1234");
        assertEquals(5_000, account.getBalance("1234"));
    }

    @Test
    public void deposit10k_Withdraw10k_BalanceIsZero(){
        assertEquals(0, account.getBalance("1234"));

        account.deposit(10_000);
        assertEquals(10_000, account.getBalance("1234"));

        account.withdraw(10_000, "1234");
        assertEquals(0, account.getBalance("1234"));
    }


    @Test
    public void balanceIsZeroDeposit10k_InputPinAndTransfer5k_BalanceIs5k(){
        assertEquals(0, account.getBalance("1234"));
        account.deposit(10_000);
        assertEquals(10_000, account.getBalance("1234"));

        account.withdraw(5_000, "1234");
        assertEquals(5_000, account.getBalance("1234"));
    }


    @Test
    public void deposit10k_InputPin_BalanceIs10k(){
        account.deposit(10_000);
        assertEquals(10_000, account.getBalance("1234"));

    }

    @Test
    public void deposit10k_InputWrongPin_BalanceIsZero(){
        assertEquals(0, account.getBalance("1234"));
        account.deposit(10_000);
        assertEquals(0, account.getBalance("1111"));
    }

    @Test
    public void deposit10k_InputPin_Withdraw5k_BalanceIs5k(){
        account.deposit(10_000);
        assertEquals(10_000, account.getBalance("1234"));

        account.withdraw(5_000, "1234");
        assertEquals(5_000, account.getBalance("1234"));
    }

    @Test
    public void deposit10k_InputWrongPin_Withdraw5k_BalanceIsStill10k(){
        account.deposit(10_000);
        assertEquals(10_000, account.getBalance("1234"));

        account.withdraw(5_000, "1111");
        assertEquals(10_000, account.getBalance("1234"));
    }

    @Test
    public void deposit10kInX_InputPin_Transfer5kToY_BalanceIs5kInX_BalanceIs5kInY(){
        assertEquals(0, account.getBalance("1234"));
        account.deposit(10_000);
        assertEquals(10_000, account.getBalance("1234"));

        account.transfer(5_000, "1234", accountTwo);
        assertEquals(5_000, account.getBalance("1234"));
        assertEquals(5_000, accountTwo.getBalance("1111"));
    }

    @Test
    public void deposit10kInX_InputWrongPin_Transfer5kToY_ThrowsException(){
        assertEquals(0, account.getBalance("1234"));
        account.deposit(10_000);
        assertEquals(10_000, account.getBalance("1234"));

        assertThrows(IllegalArgumentException.class, () ->account.transfer(5_000, "9999", accountTwo));
        assertEquals(10_000, account.getBalance("1234"));
    }

}
