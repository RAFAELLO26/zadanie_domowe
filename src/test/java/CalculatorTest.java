import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testChoiceOperation() {

    }

    public void testRoundTo4DecimalPlace() {
        double testValue = 4.5565327;
        assertEquals(4.5565, Calculator.roundTo4DecimalPlace(testValue));
    }
}