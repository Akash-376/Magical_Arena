package com.swiggy;

import java.util.Random;

/**
 * The Dice class represents a six-sided die used for determining outcomes in the Magical Arena matches.
 */
public class Dice {
	
	private static final Random random = new Random();

	/**
     * Simulates rolling the six-sided die and returns the outcome as an integer between 1 and 6.
     * @return The result of the die roll.
     */
    public static int roll() {
        return random.nextInt(6) + 1; // Assuming a six-sided die
    }
}
