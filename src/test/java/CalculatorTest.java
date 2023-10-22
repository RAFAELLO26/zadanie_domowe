import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void choiceOperation() {
        double testValue = 4.5565327;
        Assertions.assertEquals(4.5565, Calculator.roundTo4DecimalPlace(testValue));
    }
}