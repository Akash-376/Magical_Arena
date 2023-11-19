<h1 align="center"> 🤼 Magical_Arena</h1>

## Project-Overview

<p align="center">
  <b>The Magical_Arena is a Java console-based application that simulates a magical arena where players engage in matches. Each player has attributes such as health, strength, and attack, which determine their capabilities in the game. Players take turns attacking each other until one of them runs out of health..</b>
</p>

## Table of Contents
- [Prerequisites](#prerequisites)
- [How to run](#How_to_run)
- [Player Class](#Player_Class)
- [Arena Class](#Arena_Class)
- [Dice Class](#Dice_Class)
- [MagicalGameRunner Class](#MagicalGameRunner_Class)
- [Tests](#Test)

## prerequisites
To run a Maven project without an integrated development environment (IDE) or editor, you can use the command line. Here are the steps to run your Maven project:
- Maven Installation:
  Make sure you have Maven installed on your system. You can download it from Apache Maven and follow the installation instructions.

## How_to_run
**Extract the Zip Folder:**
   Extract the zip folder that has been shared with you to a location on your machine.
- Navigate to the Project Directory:
  Open a command prompt or terminal and navigate to the root directory of your Maven project where **pom.xml file is visible**.
  
  example:- cd Magical_Arena\Magical_Arena

- Build the Project:
  Run the following Maven command to compile your project, run tests, and package it
  ```
  mvn clean install
  ```
- Run the Application:
  Run the following Maven command to to Run the Application
  ```
  java -cp target/classes com.swiggy.MagicalGameRunner

  ```

## Player_Class
The Player class represents a player in the Magical Arena. It has attributes such as name, health, strength, and attack. Players can attack each other, and the 
game includes logic for handling damage and determining the winner.

## Arena_Class
The Arena class represents the magical arena where players engage in matches. It takes two Player objects and facilitates the progression of matches. The 
startMatch() method initiates the match and contains the game logic for player interactions.

## Dice_Class
The Dice class represents a six-sided die used for determining outcomes in the Magical Arena matches. It includes a roll() method that simulates rolling the die 
and returns the outcome as an integer between 1 and 6.

## MagicalGameRunner_Class
The MagicalGameRunner class serves as the entry point for the game. It prompts the user to enter details for two players, creates the players, initializes the 
arena, and starts the match.

## Test
The MagicalGameRunnerTest class contains JUnit tests for the application. It tests various aspects, such as arena initialization, player status, match outcomes, 
and handling of invalid inputs.


---

<p align="center">
  🤼<br>
  <b>Happy Gaming</b>
</p>

---
