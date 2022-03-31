import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankAccountBeforeAndAfterTest {
    static BankAccount bankAccount;

    @BeforeAll
    //@BeforeEach
    public void prepTest() {
        System.out.println("Hi!");
        bankAccount = new BankAccount(500, 0);
    }

    // @AfterAll
    @AfterEach
    public void endTest() {
        System.out.println("Buy!");
    }

    @Test
    public void testWithdraw() {
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
        System.out.println("Test 1 ok");
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(500);
        assertEquals(700, bankAccount.getBalance());
        System.out.println("Test 2 ok");
    }
}
