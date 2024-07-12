package test.src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.Adventurer;


public class AdventurerTest {
       @Test
    public void testInitialPosition() {
        Adventurer adventurer = new Adventurer(3, 3);
        assertEquals(3, adventurer.getX());
        assertEquals(3, adventurer.getY());
    }

}
