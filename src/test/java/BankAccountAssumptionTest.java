import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.*;

class BankAccountAssumptionTest {

    @Test
    @DisplayName("Test activation after creation")
    public void testActive1() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assumeTrue(bankAccount != null, "Account is NULL...because...");
        assertTrue(bankAccount.setActive());
    }

    @Test
    @DisplayName("Test activation after creation")
    public void testActive2() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assumeFalse(bankAccount == null);
        assertTrue(bankAccount.setActive());
    }


    @Test
    @DisplayName("Test activation after creation")
    public void testActive3() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assumingThat(bankAccount != null, () -> assertTrue(bankAccount.setActive()));
    }
}