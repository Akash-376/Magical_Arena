package com.swiggy;

/**
 * The Arena class represents the magical arena where players engage in matches.
 * It takes two Player objects and facilitates the progression of matches.
 */
public class Arena {
	
	private Player player_A;
    private Player player_B;

    /**
     * Constructs a new arena with the specified players.
     * @param player_A The first player participating in the match.
     * @param player_B The second player participating in the match.
     */
    public Arena(Player player_A, Player player_B) {
        this.player_A = player_A;
        this.player_B = player_B;
    }

    /**
     * Initiates the match in the arena and contains the game logic for player interactions.
     */
    public void startMatch() {
        // Game logic here
    }
    
    
}
