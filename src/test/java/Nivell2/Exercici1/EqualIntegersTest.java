package Nivell2.Exercici1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EqualIntegersTest {

    int num1 = 4;
    int num2 = 4;
    int num3 = 5;

    @Test
    void givenTwoNumbers_whenCompared_thenEqualNumbersAreEqual() {
        Assertions.assertEquals(num1, num2);
    }

    @Test
    void givenTwoNumbers_whenCompared_thenNotEqualNumbersAreNotEqual() {
        Assertions.assertNotEquals(num1, num3);
    }
}
