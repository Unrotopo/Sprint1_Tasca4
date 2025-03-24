package Nivell2.Exercici4;

import Nivell2.Exercici4.entities.Onions;
import Nivell2.Exercici4.entities.Potatoes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferentObjectsTest {

    @Test
    public void objectsList() {

        Potatoes kenebek = new Potatoes("Kenebek", "brown");
        Potatoes sour = new Potatoes("Sour", "beige");
        Onions sweet = new Onions("white", "sweet", "round");
        Onions red = new Onions("red", "mild", "round");
        Onions green = new Onions("green", "mild", "long");

        ArrayList<Object> pantry = new ArrayList<>();

        pantry.add(kenebek);
        pantry.add(sour);
        pantry.add(sweet);
        pantry.add(red);


//        Assertions.assertEquals(kenebek, pantry.get(0));
//        Assertions.assertEquals(red, pantry.get(3));
//        Assertions.assertEquals(sweet, pantry.get(2));

        Assertions.assertEquals(Arrays.asList(kenebek, sour, sweet, red), pantry);

        Assertions.assertTrue(pantry.containsAll(Arrays.asList(kenebek, sour, sweet, red)));

        Assertions.assertEquals(1, pantry.stream().filter(object -> object.equals(red)).count());

        Assertions.assertFalse(pantry.contains(green));
    }
}
