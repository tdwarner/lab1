//********************************************************************
//  RockPaperScissors.java       
//
//  STUDENT NAME: Terrance Warner
//
//  Please modify this program that plays the
//	Rock-Paper-Scissors game against the computer.
//	The program should randomly choose one of the 
//	three options, then prompt the user for a selection.
//	Then the program reveals both choices and prints who won.
//	Continue playing until the user chooses to stop. Then
//	print the number of wins/losses/ties.
//********************************************************************

import java.util.Scanner;
import java.util.Random; // import randomizer to be used for computer selection
public class RockPaperScissors
{
    //-----------------------------------------------------------------
    //  Plays the Rock-Paper-Scissors game with the user.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        final int OPTIONS = 3;
        final int ROCK = 1, PAPER = 2, SCISSORS = 3;
        final int COMPUTER = 1, PLAYER = 2, TIE = 3;
        Random generator = new Random(); // initialize randomizer

        int computerChoice, playerChoice, winner = 0;
        int wins = 0, losses = 0, ties = 0;
        String again;

        Scanner scan = new Scanner(System.in);

        again = "y";
        while (again.equalsIgnoreCase("y")) // changed from if to while for continuous play
        {
            computerChoice = generator.nextInt(3) + 1;

            System.out.println();
            System.out.print("Enter your choice - 1 for Rock, 2 for " +
                    "Paper, and 3 for Scissors: ");
            playerChoice = scan.nextInt();
            scan.nextLine();

            System.out.print("My choice was ");

            // Determine the winner
            if (computerChoice == ROCK)
            {
                System.out.println("Rock.");
                if (playerChoice == SCISSORS) {
                    winner = COMPUTER;
                } else {
                    if (playerChoice == PAPER) {
                        winner = PLAYER;
                    } else {
                        winner = TIE;
		                }
		            }
            } else if (computerChoice == PAPER) {
                System.out.println("Paper.");
		            if (playerChoice == SCISSORS) {
                    winner = PLAYER;
                } else {
                    if (playerChoice == ROCK) {
                        winner = COMPUTER;
                    } else {
                        winner = TIE;
                        }
                    }
            } else {
                System.out.println("Scissors.");
		            if (playerChoice == ROCK) {
                    winner = PLAYER;
                } else {
                    if (playerChoice == PAPER) {
                        winner = COMPUTER;
                    } else {
                        winner = TIE;
                        }
                    }
            }

            // Print results and increment appropriate counter
            if (winner == COMPUTER)
            {
                System.out.println("I win!");
                losses++; // incriment losses
            }
            else if (winner == PLAYER)
            {
                System.out.println("You win!");
                wins++; // incriment wins
            }
            else
            {
                System.out.println("We tied!");
                ties++; // icriement ties
            }

            System.out.println();
            System.out.print("Play again (y/n)? ");
            again = scan.nextLine();
        }

        // Print final results
        System.out.println();
        System.out.println("You won " + wins + " times.");
        System.out.println("You lost " + losses + " times.");
        System.out.println("We tied " + ties + " times.");
    }
}
