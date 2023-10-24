package raf.jop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void roundTo4DecimalPlace() {
        double testValue = 4.5565327;
        double result = Calculator.roundTo4DecimalPlace(testValue);
        Assertions.assertEquals(4.5565, result);
    }
}