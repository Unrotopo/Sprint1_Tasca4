package Nivell1.Exercici2;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateIDTest {

    @ParameterizedTest
    @CsvSource({
            "'B', 03901364",
            "'J', 12345678",
            "'D', 87654321",
            "'H', 12348765",
            "'Q', 19283746",
            "'B', 46372819",
            "'K', 59483726",
            "'S', 00112233",
            "'F', 99887766",
            "'T', 00000001"
    })
    void givenConcreteIDNum_whenLetterCalculated_thenGetExpectedLetter(char expectedLetter, String inputNumber) {
        CalculateID calc = new CalculateID();
        assertEquals(expectedLetter, calc.calculateID(inputNumber));
    }
}