package Nivell2.Exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SameReferenceTest {

    String string1 = "string1";
    String string2 = "string1";
    String string3 = "string2";

    @Test
    void givenTwoStrings_whenComparingThem_thenEqualStringsAreEqual() {
        Assertions.assertEquals(string1, string2);
    }

    @Test
    void givenTwoStrings_whenComparingThem_thenNotEqualStringsAreNotEqual() {
        Assertions.assertNotEquals(string1, string3);
    }
}
