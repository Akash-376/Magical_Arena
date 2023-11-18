package com.swiggy;

/**
 * The Player class represents a player in the Magical Arena.
 * Each player has attributes such as health, strength, and attack,
 * which determine their capabilities in the game.
 */
public class Player {
	private String name;
	private int health;
    private int strength;
    private int attack;
    private int netDamage;

    /**
     * Constructs a new player with the specified health, strength, and attack attributes.
     * @param health The initial health of the player.
     * @param strength The initial strength of the player.
     * @param attack The initial attack of the player.
     */
    public Player(String name, int health, int strength, int attack) {
    	this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getNetDamage() {
		return netDamage;
	}
		
	
	/**
     * Reduce the player's health based on the damage received.
     * @param damage The amount of damage to be taken.
     */
    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    /**
     * Check if the player is alive.
     * @return True if the player's health is greater than 0, false otherwise.
     */
    public boolean isAlive() {
        return health > 0;
    }
	
	/**
     * Perform an attack on another player.
     * @param defender The player being attacked.
     */
    public void attack(Player defender) {
        // Roll the attack dice using the static method in the Dice class
        int attackRoll = Dice.roll();

        // Calculate the damage inflicted by the attacker
        int damage = attackRoll * attack;

        // Roll the defending dice using the static method in the Dice class
        int defendRoll = Dice.roll();

        // Calculate the defense of the defender
        int defense = defendRoll * defender.getStrength();

        // Calculate the net damage after defending
        netDamage = Math.max(0, damage - defense);
        

        // Reduce the health of the defender
        defender.takeDamage(netDamage);
    }
    
    
    
    
}
