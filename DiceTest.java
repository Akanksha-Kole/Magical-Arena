package com.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest {
	@Test
    public void testDiceRoll() {
        for (int i = 0; i < 1000; i++) {
            int roll = Dice.roll();
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}


