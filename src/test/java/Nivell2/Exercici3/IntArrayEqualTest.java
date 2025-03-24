package Nivell2.Exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntArrayEqualTest {

    int[] array1 = {1,2,3,4,5};
    int[] array2 = {1,2,3,4,5};

    @Test
    public void arraysAreEqual() {
        Assertions.assertArrayEquals(array1, array2);
    }
}
