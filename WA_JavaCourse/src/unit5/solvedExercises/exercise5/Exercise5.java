package unit5.solvedExercises.exercise5;

import java.util.Arrays;
import java.util.Random;

// Write the function int[] rellenaPares(int length, int end) that 
// creates and returns a sorted array of the specified length filled 
// with random even numbers within the range from 2 to end inclusive.

public class Exercise5 {

	// Function to print the array content.
	private static void printArray(int[] evenNumbersArray) {

		for (int i = 0; i < evenNumbersArray.length; i++) {

			System.out.printf(" | %d ", evenNumbersArray[i]);

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

	// Function to fill array with even random sorted numbers.
	public static int[] fillWithEven(int length, int end) {

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

	public static void main(String[] args) {

		int[] evenNumbersArray1 = fillWithEven(10, 20);

		System.out.println("First table print: ");
		printArray(evenNumbersArray1);

		int[] evenNumbersArray2 = fillWithEven(10, 20);

		System.out.println("Second table print: ");
		printArray(evenNumbersArray2);

	}

}
