package com.swiggy;

/**
 * The Arena class represents the magical arena where players engage in matches.
 * It takes two Player objects and facilitates the progression of matches.
 */
public class Arena {
	
	private int rounds = 1;
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
    
    

    public Player getPlayer_A() {
		return player_A;
	}

	public Player getPlayer_B() {
		return player_B;
	}



	/**
     * Initiates the match in the arena and contains the game logic for player interactions.
     */
    public void startMatch() {
        // Game logic here
    	// if both player have zero health
    	if(player_A.getHealth() ==0 && player_B.getHealth() ==0) {
    		System.out.println("Both players with zero health can not fight");
    		return;
    	}
    	System.out.println("-------- Game Start --------\n");
        System.out.println(player_A.getName() + " (Health: " + player_A.getHealth() + ") VS " + player_B.getName() + " (Health: " + player_B.getHealth() + ")\n");

        // Determine the player with lower health to attack first
        Player attacker = (player_A.getHealth() < player_B.getHealth()) ? player_A : player_B;
        Player defender = (attacker.equals(player_A)) ? player_B : player_A;

        while (player_A.isAlive() && player_B.isAlive()) {
            attacker.attack(defender);
            printMatchStatus(attacker, defender);

            // Swap attacker and defender for the next round
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        
        System.out.println("\n***  Game Over ***\n");
        System.out.println("*** Final result ***\n");
        System.out.println(attacker.getHealth()==0? defender.getName()+" won " : attacker.getName()+" won ");
        
        
    }
    
    
    /**
     * Prints the status of the match after each attack round.
     *
     * @param attacker The player initiating the attack.
     * @param defender The player defending against the attack.
     */
    private void printMatchStatus(Player attacker, Player defender) {
        // Increase the round count and display the round number
        System.out.println("Round : " + rounds++);

        // Display the attack information, including attacker and defender names
        System.out.println(attacker.getName() + " attacks " + defender.getName() + "!\n");

        // Display the net damage caused by the attacker
        System.out.println("Net Damage: " + attacker.getNetDamage());

        // Display the health of the defender after the attack
        System.out.println(defender.getName() + " Health: " + defender.getHealth());

        // Display the health of the attacker after the attack
        System.out.println(attacker.getName() + " Health: " + attacker.getHealth());

        // Separate each round's information with a line of dashes for clarity
        System.out.println("---------------------------\n");
    }
    
    
}
