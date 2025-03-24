package Nivell1.Exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OutOfBoundsTest {

    @Test
    void test() {
        Exception exception = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            int[] nums = {1, 2, 3, 4, 5};
            GetsElement gets = new GetsElement();
            gets.getsElement(6, nums);
        });

        Assertions.assertTrue(exception.getMessage().contains("Index out of bounds"));
    }
}
