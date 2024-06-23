package com.akanksha;

import java.util.Random;

public class Dice {
	private static final int SIDES = 6;
    private static final Random random = new Random();

    public static int roll() {
        return random.nextInt(SIDES) + 1;
    }
}
