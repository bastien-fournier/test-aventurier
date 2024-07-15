package test.src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.Adventurer;


public class AdventurerTest {
       @Test

       //  vérifie que l'initialisation de la position de l'aventurier fonctionne correctement
    public void testInitialPosition() {
        Adventurer adventurer = new Adventurer(3, 3);
        assertEquals(3, adventurer.getX());
        assertEquals(3, adventurer.getY());
    }

}
