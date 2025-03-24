package Nivell2.Exercici6;

import Nivell2.Exercici6.AccessWhatIsNotThere;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NothingThereTest {

    @Test
    public void anythingThereTest() {

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            AccessWhatIsNotThere.anythingThere(3);
        });

        Assertions.assertDoesNotThrow(() -> {
            AccessWhatIsNotThere.anythingThere(2);
        });
    }
}
