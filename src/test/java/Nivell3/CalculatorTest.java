package Nivell3;

import Nivell3.entities.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void sumTest() {

        Assertions.assertEquals(5, calc.mySum(2, 3));
        Assertions.assertEquals(32, calc.mySum(15, 17));
    }

    @Test
    public void substractTest() {

        Assertions.assertEquals(3, calc.mySubstraction(5, 2));
        Assertions.assertEquals(-2, calc.mySubstraction(-5, -3));
    }

    @Test
    public void multiplyTest() {

        Assertions.assertEquals(12, calc.myMultiplier(4, 3));
        Assertions.assertEquals(0, calc.myMultiplier(0, 200));
        Assertions.assertEquals(6, calc.myMultiplier(-2, -3));
        Assertions.assertEquals(-6, calc.myMultiplier(-3, 2));
        Assertions.assertEquals(-6, calc.myMultiplier(2, -3));
    }

    @Test
    public void divideTest() {

        Assertions.assertEquals(4, calc.myDivider(12, 3));
        Assertions.assertEquals(0, calc.myDivider(0, 531));
        Assertions.assertEquals(3, calc.myDivider(-6, -2));
        Assertions.assertEquals(6, calc.myDivider(-18, -3));
        Assertions.assertThrows(ArithmeticException.class, () -> calc.myDivider(-2, 0));
    }
}
