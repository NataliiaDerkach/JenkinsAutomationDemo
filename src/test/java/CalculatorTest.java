import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        int actualResult = 5 + 5;
        int expectedResult = 10;

        assertEquals(expectedResult, actualResult);
    }
}
