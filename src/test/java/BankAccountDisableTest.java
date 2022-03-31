import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountDisableTest {

    @Test
    @DisplayName("Deposit 500 successfully")
    @Disabled("Temporarily disabled due to maintenance")
    public void depositTest() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.deposit(200);
        assertEquals(700, bankAccount.getBalance());
    }
}
