import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class BankAccountConditionalTest {

    @Test
    @EnabledOnOs({OS.MAC})
    public void testMac() {

    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testWindows() {

    }

    @Test
    //@EnabledOnJre({JRE.JAVA_17})
    @DisabledOnJre({JRE.JAVA_17})
    public void testJRE() {

    }

    @Test
    @EnabledOnJre({JRE.JAVA_16})
    public void testJRE16() {

    }
}
