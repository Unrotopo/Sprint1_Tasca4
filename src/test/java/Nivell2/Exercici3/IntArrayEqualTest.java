package Nivell2.Exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntArrayEqualTest {

    int[] array1 = {1,2,3,4,5};
    int[] array2 = {1,2,3,4,5};
    int[] array3 = {1,2,3,4,6};

    @Test
    void givenTwoArrays_whenCompared_thenEqualArraysAreEqual() {
        Assertions.assertArrayEquals(array1, array2);
    }

    @Test
    void givenTwoArrays_whenCompared_thenNotEqualArraysAreNotEqual() {
        Assertions.assertArrayEquals(array1, array3);
    }
}
