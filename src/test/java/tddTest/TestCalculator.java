package tddTest;

import org.junit.jupiter.api.*;
import tdd.Calculator;

import java.util.stream.Stream;

public class TestCalculator {

    private Calculator calc;

    @BeforeEach
    public void initEach() {
        calc = new Calculator();
    }

    @Test
    //@DisplayName("Null Input Test")
    public void TestWithNullInput() {
        int result = calc.add(null);
        Assertions.assertEquals(result, 0);
    }

    @Test
    public void TestWithEmptyInput() {
        int result = calc.add("");
        Assertions.assertEquals(result, 0);
    }

    @Test
    public void TestWithInvalidInput() {
        Assertions.assertThrows(NumberFormatException.class, () -> calc.add("a"));
    }

    @Test
    public void TestWithMultipleInvalidInput() {
        Assertions.assertThrows(NumberFormatException.class, () -> calc.add("aba,cd,3"));
    }

    @Test
    public void TestWith1NumberInput() {
        int result = calc.add("1");
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void TestWithMultipleNumberInput(){
        int result = calc.add("1\n2,3");
        Assertions.assertEquals(result, 6);
    }

    @Test
    public void TestWithMultipleNumberInputAndVariableDelimiter() {
        int result = calc.add(";1\n2;3");
        Assertions.assertEquals(result, 6);
    }

    @Test
    public void TestWithNegativeNumbers() {
        Assertions.assertThrows(RuntimeException.class, () -> calc.add(";1\n2;-3;6;-7"));
    }


    @Test
    void assumtionThat() {
        System.out.println("Running assumption.");
        Assumptions.assumeTrue(7 > 6);
        Assertions.assertEquals(5+2, 7);
        System.out.println("Completed assumption.");
    }


}
