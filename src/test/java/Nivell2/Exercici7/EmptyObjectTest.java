package Nivell2.Exercici7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmptyObjectTest {

    @Test
    void givenEmptyObject_whenChecking_thenObjectIsEmpty() {
        EmptyObject emptyObject = new EmptyObject();
        Assertions.assertNull(emptyObject.attribute);
    }
}
