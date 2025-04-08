package Nivell3;

import Nivell3.entities.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void givenTwoNumbers_whenAdded_thenResultIsCorrect() {
        Assertions.assertEquals(5, calc.mySum(2, 3));
        Assertions.assertEquals(32, calc.mySum(15, 17));
    }

    @Test
    void givenTwoPositiveNumbers_whenSubstracted_thenResultIsCorrect() {
        Assertions.assertEquals(3, calc.mySubstraction(5, 2));
    }

    @Test
    void givenTwoNegativeNumbers_whenSubstracted_thenResultIsCorrect() {
        Assertions.assertEquals(-2, calc.mySubstraction(-5, -3));
    }

    @Test
    void givenTwoPositiveNumbers_whenMultiplied_thenResultIsCorrect() {
        Assertions.assertEquals(12, calc.myMultiplier(4, 3));
    }

    @Test
    void givenPositiveNumber_whenMultipliedByCero_thenResultIsZero() {
        Assertions.assertEquals(0, calc.myMultiplier(0, 3));
    }

    @Test
    void givenTwoNegativeNumbers_whenMultiplied_thenResultIsCorrect() {
        Assertions.assertEquals(12, calc.myMultiplier(-4, -3));
    }

    @Test
    void givenNegativeNumber_whenMultipliedByPositive_thenResultIsNegative() {
        Assertions.assertEquals(-12, calc.myMultiplier(-4, 3));
    }

    @Test
    void givenPositiveNumber_whenMultipliedByNegative_thenResultIsNegative() {
        Assertions.assertEquals(-12, calc.myMultiplier(4, -3));
    }

    @Test
    void givenTwoPositiveNumbers_whenDivided_thenResultIsCorrect() {
        Assertions.assertEquals(4, calc.myDivider(12, 3));
    }

    @Test
    void givenZero_whenDividedByPositive_thenResultIsZero() {
        Assertions.assertEquals(0, calc.myDivider(0, 531));
    }

    @Test
    void givenTwoNegativeNumbers_whenDivided_thenResultIsCorrect() {
        Assertions.assertEquals(3, calc.myDivider(-12, -4));
    }

    @Test
    void givenNegativeNumber_whenDividedByZero_thenExceptionIsThrown() {
        Assertions.assertThrows(ArithmeticException.class, () -> calc.myDivider(-12, 0));
    }
}
