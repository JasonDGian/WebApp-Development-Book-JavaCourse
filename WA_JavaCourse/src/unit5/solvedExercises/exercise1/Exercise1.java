package unit5.solvedExercises.exercise1;

import java.util.Random;

public class Exercise1 {

	// Create a table (array) of length 10 initialized with random numbers between 1
	// and 100. Display the sum of all the random numbers stored in the table.

	// Function to initialize.

	private static void initializeRandom(int[] intArray) {

		Random generator = new Random();

		for (int i = 0; i < intArray.length; i++) {

			intArray[i] = generator.nextInt(100);

		}

	}

	private static void printArray(int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {

			System.out.println(intArray[i]);

		}

	}

	private static int sumArrayElements(int[] intArray) {

		int result = 0;

		for (int i = 0; i < intArray.length; i++) {

			result = result + intArray[i];

		}

		return result;
	}

	public static void main(String[] args) {

		int[] myArray = new int[10];

		initializeRandom(myArray);
		printArray(myArray);
		System.out.println("--- SUM OF ARRAY ELELMENTS ---");
		System.out.println(sumArrayElements(myArray));

	}

}
