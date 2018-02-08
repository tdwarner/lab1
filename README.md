CONTENTS of this folder:
-------------------------

1. FixMe1.java - Modify program to compile and run
2. RockPaperScissors.java - Modify program to correctly perform it's target functionality.

   Inspect and modify the files above in any editor of your choice.

   Compile with `javac <filename.java>`

   Run with `java <filename>`

DOCUMENTATION for CHANGES:
---------------------------

Modified by:
   Terrance Warner

In the FixMe1.java file I corrected the case of the public class fixme1 to match the filename of FixMe1

In the RockPaperScissors.java file I added the following lines of code

Line 16 -	import java.util.Random; // import randomizer for computer selection
	
Line 27 -	Random generator = new Random(); // initialize randomizer

Line 36 -	while (again.equalsIgnoreCase("y")) // changed from "if (again...)"" to while (again...) for continuous play

Line 38 -	changed "computerChoice = ROCK;" to computerChoice = generator.nextInt(3) + 1; so the computer didnt always choose rock but instead a random number from 1 - 3

Line 63 - 71 
			if (playerChoice == SCISSORS) {
			            winner = PLAYER;
			        } else {
			            if (playerChoice == ROCK) {
			                winner = COMPUTER;
			            } else {
			                winner = TIE;
			                }
			            }
Line 74 - 82			            
			 if (playerChoice == ROCK) {
			            winner = PLAYER;
			        } else {
			            if (playerChoice == PAPER) {
			                winner = COMPUTER;
			            } else {
			                winner = TIE;
			                }
			            }

Line 89
added loss, wins, ties, incrimentation after winner declarations 
System.out.println("I win!");
losses++; // incriment losses

Line 94
System.out.println("You win!");
wins++; // incriment wins

Line 99
System.out.println("We tied!");
ties++; // icriement ties