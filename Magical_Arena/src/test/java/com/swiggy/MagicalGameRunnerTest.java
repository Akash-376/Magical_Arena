package com.swiggy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for the MagicalGameRunner application.
 */
public class MagicalGameRunnerTest 
{
	  /**
      * Tests the initialization of the Arena class.
      * Verifies that the Arena is initialized with the correct players.
      */
      @Test
      public void testArenaInitialization() {
          Player player1 = new Player("Player1", 20, 5, 10);
          Player player2 = new Player("Player2", 25, 10, 5);

          Arena arena = new Arena(player1, player2);

          assertEquals(player1, arena.getPlayer_A());
          assertEquals(player2, arena.getPlayer_B());
      }  
	  /**
	   * Tests the isAlive method of the Player class.
	   * Verifies that the method correctly identifies whether a player is alive or not.
	   */
	  @Test
	  public void testPlayerIsAlive() {
	      Player alivePlayer = new Player("AlivePlayer", 20, 5, 10);
	      Player deadPlayer = new Player("DeadPlayer", 0, 5, 10);
	
	      assertTrue(alivePlayer.isAlive());
	      assertFalse(deadPlayer.isAlive());
	  }
	  
	  /**
	   * Tests the behavior of the Arena class during a match.
	   * Verifies that the match ends with one player having 0 health.
	   * Also checks that both players do not have 0 health simultaneously.
	   */
	  @Test
	  public void testArenaMatch() {
	      Player player1 = new Player("Player1", 20, 5, 10);
	      Player player2 = new Player("Player2", 25, 10, 5);
	
	      Arena arena = new Arena(player1, player2);
	      arena.startMatch();
	
	      // Assert that one of the players has health 0 (indicating a winner)
	      assertTrue(player1.getHealth() == 0 || player2.getHealth() == 0);
	        
	      // Assert that both players do not have 0 health at the same time
	      assertFalse(player1.getHealth() == 0 && player2.getHealth() == 0);
	  }
	   
	  /**
	   * Tests the behavior of the Player class when initialized with negative health.
	   * Verifies that the health is set to a minimum of 0.
	   */
	  @Test
	  public void testPlayerNegativeHealth() {
	      Player player = new Player("NegativeHealthPlayer", -5, 5, 10);
	      assertEquals(10, player.getHealth()); // Health should not be negative
	  }
	   
	  /**
	   * Tests the behavior of the Player class when initialized with zero strength.
	   * Verifies that the strength is set to a minimum of 1.
	   */
	  @Test
	  public void testPlayerZeroStrength() {
	      Player player = new Player("ZeroStrengthPlayer", 20, 0, 10);
	      assertEquals(1, player.getStrength()); // Strength should be at least 1
	  }
	    
	  /**
	   * Tests the behavior of the Arena class when both players start with 0 health.
	   * Verifies that the match ends instantly with both players having 0 health.
	   */
	  @Test
	  public void testArenaInstantMatchEnd() {
	      Player player1 = new Player("Player1", 0, 5, 10);
	      Player player2 = new Player("Player2", 0, 10, 5);
	
	      Arena arena = new Arena(player1, player2);
	      arena.startMatch();
	
	      // Both players start with 0 health, so the match should end instantly
	      assertTrue(player1.getHealth() == 0 && player2.getHealth() == 0);
	  }
}
