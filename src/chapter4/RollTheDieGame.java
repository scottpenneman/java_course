package chapter4;

/*
Roll the die for the user (random number between 1-6) and advance the user the number of spaces.
After each roll, tell the user which space they are on and how many spaces left to go to win.
Repeat 4 additional times for 5 rolls total.
However, if user gets to 20 before 5 rolls, end the game.
If they are greater than or less than 20 spaces exactly, they lose.
 */

import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args) {

        Random random = new Random();
        int maxRolls = 5; // Angie had this
        int roll = 0; // this wouldn't be needed if a for loop was used, as the count would be iterated with int i"
        int gameSpace = 0; // she used currentSpace
        int gameGoal = 20; // she used lasSPace
        int spacesLeft = 0;

        do{
            roll++;
            int die = random.nextInt(6) + 1;
            gameSpace += die;
            spacesLeft = gameGoal - gameSpace;
            System.out.println("Roll #" + roll +". You rolled a " + die + ". You are now on space " + gameSpace + " and have "
                    + spacesLeft + " spaces left!");

        } while (roll < maxRolls && gameSpace < gameGoal);

        if(gameSpace == gameGoal) {
            System.out.println("Perfect landing!");
        } else if(gameSpace < gameGoal) {
            System.out.println("You fell short this time.");
        } else {
            System.out.println("You overshot the landing.");
        }

    }

}
