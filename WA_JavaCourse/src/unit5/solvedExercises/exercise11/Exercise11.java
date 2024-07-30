package unit5.solvedExercises.exercise11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* Develop the game "The Secret Code," which involves 
 * unlocking a chamber using a secret combination made 
 * up of digits from one to five. The player will 
 * specify the length of the combination; the longer 
 * the combination, the greater the difficulty. 
 * 
 * The application will randomly generate a secret 
 * combination that the user must guess. For each 
 * attempt, the application will show the player 
 * whether each digit is greater than or less than the 
 * corresponding digit in the winning combination.
*/

public class Exercise11 {

	public static void generateCombination(int[] combination) {

		Random generator = new Random();

		for (int i = 0; i < combination.length; i++) {
			combination[i] = generator.nextInt(9);
		}
	}

	public static void storePlayerGuess(int[] playerGuess, Scanner sc) {

		for (int i = 0; i < playerGuess.length; i++) {
			System.out.println("Enter your choice for digit number " + (i + 1));
			playerGuess[i] = sc.nextInt();
		}

	}

	public static void printDigitsCheck(int[] secretCombination, int[] playerGuess) {

		int[] result = new int[secretCombination.length];

		for (int index = 0; index < secretCombination.length; index++) {

			result[index] = secretCombination[index] - playerGuess[index];

			if (secretCombination[index] > playerGuess[index]) {
				System.out.println("Digit " + (index + 1) + " is too low.");
			} else if (secretCombination[index] == playerGuess[index]) {
				System.out.println("Digit " + (index + 1) + " is RIGHT!");
			}

			else {
				System.out.println("Digit " + (index + 1) + " is too high.");
			}

		}

	}

	private static boolean checkWinStatus(int[] secretCombination, int[] playerGuess) {

		boolean isWin = true;

		for (int i = 0; i < secretCombination.length; i++) {

			if (secretCombination[i] != playerGuess[i]) {
				isWin = false;
			}
		}
		return isWin;
	}

	public static void main(String[] args) {
		// Scanner instance.
		Scanner sc = new Scanner(System.in);

		// Prompt the user to ask for difficulty settings.
		System.out.println("What difficulty do you wish to play?\n Enter a number from 1 to 5: ");
		int difficulty = sc.nextInt();

		System.out.println("Difficulty selected: " + difficulty);

		int[] secretCombination = new int[difficulty];

		// Generate secret combination.
		generateCombination(secretCombination);
		System.out.println("Secret number generated succesfully.");

		System.out.println("Enter your guess for the " + difficulty + " digits.");
		int[] playerGuess = new int[difficulty];
		boolean isWin = false;

		while (!isWin) {
			storePlayerGuess(playerGuess, sc);

			System.out.println("Your combination: " + Arrays.toString(playerGuess));

			// Check player digits
			printDigitsCheck(secretCombination, playerGuess);

			isWin = checkWinStatus(secretCombination, playerGuess);

		}

		System.out.println(" YOU WIN! ");
	}
}
