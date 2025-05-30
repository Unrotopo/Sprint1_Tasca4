package Nivell1.Exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OutOfBoundsTest {

    @Test
    void givenArrayWithCertainSize_whenTryingToAccessNonExistentElement_thenOufOfBoundsExceptionThrown() {
        Exception exception = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            int[] nums = {1, 2, 3, 4, 5};
            GetsElement gets = new GetsElement();
            gets.getsElement(6, nums);
        });

        Assertions.assertTrue(exception.getMessage().contains("Index out of bounds"));
    }
}
