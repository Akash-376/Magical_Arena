package com.swiggy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MagicalGameRunner 
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Player 1:");
        Player player1 = createPlayer(scanner);

        System.out.println("\nEnter details for Player 2:");
        Player player2 = createPlayer(scanner);

        Arena arena = new Arena(player1, player2);
        arena.startMatch();

        scanner.close();
    }
    
    /**
     * Creates a new player by taking input from the user.
     *
     * @param scanner The Scanner object to read user input.
     * @return A new Player object with the specified attributes.
     */
    private static Player createPlayer(Scanner scanner) {
        System.out.print("Enter player name: ");
        String name = scanner.nextLine().trim(); // Trim to remove leading/trailing white spaces

        // Validate that the name is not empty
        while (name.isEmpty()) {
            System.out.println("Name cannot be empty. Please enter a valid name.");
            System.out.print("Enter player name: ");
            name = scanner.nextLine().trim();
        }

        // Input and validation for player health
        System.out.print("Enter player health: ");
        int health = -1; // just to initialize this variable
        
        while(true) {        	
        	try {
        		health = scanner.nextInt();
        		break;
        	} catch (InputMismatchException e) {
        		// Consume the invalid input
                scanner.nextLine();
                System.out.println("Please enter a valid integer number");
                System.out.print("Enter player health: ");
        	}
        }
        // Validate that health is a positive integer
        while (health <= 0) {
            System.out.println("Health must be a positive integer. Please enter a valid health value.");
            System.out.print("Enter player health: ");
            health = scanner.nextInt();
        }
        health = Math.min(100, health); // max health is 100
        
        // Input and validation for player strength
        System.out.print("Enter player strength: ");
        int strength = -1; // just to initialize this variable
        
        while(true) {
        	try {
        		strength = scanner.nextInt();
        		break;
        	} catch (InputMismatchException e) {
        		// Consume the invalid input
                scanner.nextLine();
                System.out.println("Please enter a valid integer number");
                System.out.print("Enter player strength: ");
        	}
        }
        // Validate that strength is a positive integer
        while (strength <= 0) {
            System.out.println("Strength must be a positive integer. Please enter a valid strength value.");
            System.out.print("Enter player strength: ");
            strength = scanner.nextInt();
        }

        
        // Input and validation for player attack
        System.out.print("Enter player attack: ");
        int attack = -1; // just to initialize this variable
        
        while(true) {     	
        	try {
        		attack = scanner.nextInt();
        		break;
        	} catch (InputMismatchException e) {
        		// Consume the invalid input
                scanner.nextLine();
                System.out.println("Please enter a valid integer number");
                System.out.print("Enter player attack: ");
        	}
        }
        // Validate that attack is a positive integer
        while (attack <= 0) {
            System.out.println("Attack must be a positive integer. Please enter a valid attack value.");
            System.out.print("Enter player attack: ");
            attack = scanner.nextInt();
        }
        
        // Consume the newline character
        scanner.nextLine(); // Added this line

        return new Player(name, health, strength, attack);
    }
}
