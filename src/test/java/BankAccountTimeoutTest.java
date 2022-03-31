import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.Duration;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

// @Timeout(value = 500, unit = TimeUnit.MILLISECONDS) -- for all tests
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountTimeoutTest {

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    public void testDepositTimeoutAssertion(BankAccount bankAccount) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bankAccount.deposit(300);
        assertEquals(300, bankAccount.getBalance());
    }

    @Test
    public void testDepositTimeoutAnnotation(BankAccount bankAccount) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bankAccount.deposit(300);
        assertTimeout(Duration.ofMillis(500), () -> {
            //Thread.sleep(1000);
            Thread.sleep(10);
        });
    }
}
