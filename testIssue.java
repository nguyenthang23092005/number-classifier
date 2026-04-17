import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierTest {

    @Test
    public void testInvalidInput() {
        String result = NumberClassifier.classifyNumbers(0);
        assertEquals("Invalid input", result);
    }

    @Test
    public void testValidInput() {
        String result = NumberClassifier.classifyNumbers(3);
        assertTrue(result.contains("1: Odd"));
        assertTrue(result.contains("2: Even"));
        assertTrue(result.contains("3: Odd"));
    }
}