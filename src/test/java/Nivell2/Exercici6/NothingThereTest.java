package Nivell2.Exercici6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NothingThereTest {

    @Test
    void givenAnArrayWithLimitedElements_whenTryingToAccessOutOfRange_thenExceptionIsThrown() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            AccessWhatIsNotThere.anythingThere(3);
        });
    }

    @Test
    void givenArrayWithLimitedElements_whenTryingToAccessInRange_thenNoExceptionIsThrown() {
        Assertions.assertDoesNotThrow(() -> {
            AccessWhatIsNotThere.anythingThere(2);
        });
    }
}
