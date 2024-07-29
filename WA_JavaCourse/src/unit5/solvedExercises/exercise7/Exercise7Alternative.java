package unit5.solvedExercises.exercise7;

import java.util.Arrays;

public class Exercise7Alternative {

	public static void main(String[] args) {

		int[] array = { 1, 4, 10, 2, 2, 2, 5, 3, 3, 4, 2, 5, 5, 6, 7, 8, 9, 1, 10, 10, 10 };
		int[] unike = noRepeats(array);

		Arrays.sort(array);
		printArray(array);
		Arrays.sort(unike);
		printArray(unike);

	}

	static int searchElement(int[] array, int element) {

		int result;

		if (Arrays.binarySearch(array, element) >= 0) {
			result = 1;
		}

		else {
			result = -1;
		}

		return result;

	}

	static int[] noRepeats(int[] t) {

		int[] temporalArray = new int[0];

		for (int element : t) {

			if (searchElement(temporalArray, element) == -1) {
				temporalArray = Arrays.copyOf(temporalArray, (temporalArray.length + 1));
				temporalArray[temporalArray.length - 1] = element;
			}

		}

		return temporalArray;

	}

	// Function to print the array content.
	private static void printArray(int[] evenNumbersArray) {

		for (int i = 0; i < evenNumbersArray.length; i++) {

			System.out.printf(" | %02d ", evenNumbersArray[i]);

		}

		System.out.print("| \n");

	}

}
