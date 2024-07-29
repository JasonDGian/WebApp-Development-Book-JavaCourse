package unit5.solvedExercises.exercise6;

import java.util.Arrays;
import java.util.Random;

// Define a function that takes as parameters two arrays: 
// the first with 6 numbers from a lottery bet, the second 
// (sorted) with the 6 numbers of the winning combination. 
// The function will return the number of matches.

public class Exercise6 {

	// MAIN METHOD - MAIN PROGRAMME ENTRY POINT.
	public static void main(String[] args) {

		int ticketNumbers = 6;
		int ticketMaxNum = 50;

		int[] bet = fillWithEvenRandom(ticketNumbers, ticketMaxNum);
		int[] winner = fillWithEvenRandom(ticketNumbers, ticketMaxNum);

		printArray(bet);
		printArray(winner);
		System.out.println("The number of matching numbers is: " + getNumberOfMatches2(bet, winner));

	}

	// Corrected version based on what the exercise actually asks for.
	public static int getNumberOfMatches2(int[] arrayA, int[] arrayB) {

		int numberOfMatches = 0;

		for (int number : arrayA) {

			if (Arrays.binarySearch(arrayB, number) >= 0) {
				numberOfMatches++;
			}

		}

		return numberOfMatches;

	}

// Function to print the array content.
	private static void printArray(int[] evenNumbersArray) {

		for (int i = 0; i < evenNumbersArray.length; i++) {

			System.out.printf(" | %02d ", evenNumbersArray[i]);

		}

		System.out.print("| \n");

	}

// Function to check if number is even.
	public static boolean isEven(int num) {

		boolean isEven = false;

		if (num % 2 == 0) {
			isEven = true;
		}

		return isEven;
	}

// Function to fill array with even random numbers.
	public static int[] fillWithEvenRandom(int length, int end) {

		// Creates random generator.
		Random generator = new Random();

		// Create array to be returned.
		int[] filledWithPairs = new int[length];
		int randomNumber;

		// for the length of the array fill with random pairs.
		for (int i = 0; i < length; i++) {

			randomNumber = generator.nextInt(end);

			if (isEven(randomNumber)) {
				filledWithPairs[i] = randomNumber;
			} else {
				filledWithPairs[i] = randomNumber + 1;
			}

		}

		Arrays.sort(filledWithPairs);

		// Returns the resulting array.
		return filledWithPairs;

	}

}
