package test.src;

import src.Forest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ForestTest {
    
    @Test
    public void testCanMove() {
        Forest forest = new Forest();
        assertFalse(forest.canMove(0, 0)); // Vérifie que la case (0, 0) est accessible dans la forêt
        assertTrue(forest.canMove(5, 5)); // Vérifie que la case (5, 5) n'est pas accessible
    }
}
