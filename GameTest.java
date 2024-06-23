package com.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
	@Test
    public void testGameInitialization() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Game game = new Game(playerA, playerB);
        assertNotNull(game);
    }

    @Test
    public void testGamePlay() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Game game = new Game(playerA, playerB);
        game.start();

        assertTrue(playerA.isAlive() || playerB.isAlive());
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }
}


