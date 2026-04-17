import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierTest {

    @Test
    public void testNEqualsOne() {
        String result = NumberClassifier.classifyNumbers(1);
        assertEquals("1: Odd\n", result);
    }

    @Test
    public void testMultipleNumbers() {
        String result = NumberClassifier.classifyNumbers(4);
        assertTrue(result.contains("1: Odd"));
        assertTrue(result.contains("2: Even"));
        assertTrue(result.contains("3: Odd"));
        assertTrue(result.contains("4: Even"));
    }
}