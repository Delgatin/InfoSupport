package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    @Test
    public void TestWithNullInput() {
        Calculator calc = new Calculator();
        int result = calc.add(null);
        Assertions.assertEquals(result, 0);
    }

    @Test
    public void TestWithEmptyInput() {
        Calculator calc = new Calculator();
        int result = calc.add("");
        Assertions.assertEquals(result, 0);
    }

    @Test
    public void TestWithInvalidInput() {
        Calculator calc = new Calculator();
        Assertions.assertThrows(NumberFormatException.class, () -> calc.add("a"));
    }

    @Test
    public void TestWith1NumberInput() {
        Calculator calc = new Calculator();
        int result = calc.add("1");
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void TestWithMultipleNumberInput() {
        Calculator calc = new Calculator();
        int result = calc.add(";1\n2;3");
        Assertions.assertEquals(result, 6);
    }

    @Test
    public void TestWithNegativeNumbers() {
        Calculator calc = new Calculator();
        Assertions.assertThrows(RuntimeException.class, () -> calc.add(";1\n2;-3;6;-7"));
    }
}
