package Nivell2.Exercici1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualIntegersTest {

    int num1 = 4;
    int num2 = 4;
    int num3 = 5;

    @Test
    public void equalInts() {
        Assertions.assertEquals(num1, num2);
        Assertions.assertNotEquals(num1, num3);
    }
}
