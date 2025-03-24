package Nivell2.Exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameReferenceTest {

    String string1 = "string1";
    String string2 = "string1";
    String string3 = "string2";

    @Test
    public void testSameReference() {
        Assertions.assertEquals(string1, string2);
        Assertions.assertNotEquals(string1, string3);
    }
}
