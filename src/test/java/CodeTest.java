import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeTest {

    @Test
    void sayHello() {
        Code code = new Code();
        assertEquals(code.sayHello(), "Hello, it's JUnit");
    }
}