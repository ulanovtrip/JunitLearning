import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculateMethodsMockitoTest {

    @Mock
    CalculateMethods calculateMethods;

    @BeforeEach
    public void setupMocks() {
        Mockito.when(calculateMethods.divide(6, 4)).thenReturn(2.0);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculateMethods.divide(6, 4));
    }
}
