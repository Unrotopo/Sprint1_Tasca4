package Nivell2.Exercici5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class MapContainsKeyTest {

    @Test
    void givenHashMap_whenKeyChecked_thenMapContainsThatKey() {
        HashMap<Integer, String> map = new HashMap<>();
        {
            map.put(1, "one");
            map.put(2, "two");
            map.put(3, "three");
            map.put(4, "four");
        }
        Assertions.assertEquals(3, map.keySet().toArray()[2]);
    }
}
