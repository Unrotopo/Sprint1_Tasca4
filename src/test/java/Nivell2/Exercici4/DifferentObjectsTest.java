package Nivell2.Exercici4;

import Nivell2.Exercici4.entities.Onions;
import Nivell2.Exercici4.entities.Potatoes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class DifferentObjectsTest {

    Potatoes kenebek = new Potatoes("Kenebek", "brown");
    Potatoes sour = new Potatoes("Sour", "beige");
    Onions sweet = new Onions("white", "sweet", "round");
    Onions red = new Onions("red", "mild", "round");
    Onions green = new Onions("green", "mild", "long");

    ArrayList<Object> pantry = new ArrayList<>();

    @BeforeEach
    void initializePantry() {
        pantry.add(kenebek);
        pantry.add(sour);
        pantry.add(sweet);
        pantry.add(red);
    }

    @Test
    void givenArrayWithObjects_whenOrderChecked_thenObjectsAreInInsertionOrder() {
        Assertions.assertEquals(Arrays.asList(kenebek, sour, sweet, red), pantry);
    }

    @Test
    void givenArrayWithObjects_whenChecked_thenArrayContainsObjects() {
        Assertions.assertTrue(pantry.containsAll(Arrays.asList(kenebek, sour, sweet, red)));
    }

    @Test
    void givenArrayWithObjects_whenChecked_thenArrayContainsOnlyOneGivenObject() {
        Assertions.assertEquals(1, pantry.stream().
                filter(object -> object.equals(red)).
                count());
    }

    @Test
    void givenArrayWithObjects_whenObjectNotAdded_thenArrayDoesNotContainIt() {
        Assertions.assertFalse(pantry.contains(green));
    }
}
