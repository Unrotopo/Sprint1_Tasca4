package Nivell2.Exercici7.test;

import Nivell2.Exercici7.EmptyObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmptyObjectTest {

    @Test
    public void EmptyObjectTest() {

        EmptyObject emptyObject = new EmptyObject();
        Assertions.assertNull(emptyObject.attribute);
    }
}
