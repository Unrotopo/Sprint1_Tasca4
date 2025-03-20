package Nivell1.Exercici2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateIDTest {

    @Test
    public void testCalculateID() {

        CalculateID calc = new CalculateID();

        assertEquals("B".charAt(0), calc.calculateID("03901364"));
        assertEquals("J".charAt(0), calc.calculateID("12345678"));
        assertEquals("D".charAt(0), calc.calculateID("87654321"));
        assertEquals("H".charAt(0), calc.calculateID("12348765"));
        assertEquals("Q".charAt(0), calc.calculateID("19283746"));
        assertEquals("B".charAt(0), calc.calculateID("46372819"));
        assertEquals("K".charAt(0), calc.calculateID("59483726"));
        assertEquals("S".charAt(0), calc.calculateID("00112233"));
        assertEquals("F".charAt(0), calc.calculateID("99887766"));
        assertEquals("T".charAt(0), calc.calculateID("00000001"));
    }
}
