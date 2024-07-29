package unit5.solvedExercises.exercise7;

import java.util.Arrays;

// Implement the function: int[] noRepeats (int t[]), which constructs 
// and returns an array of appropriate length, containing elements from `t `
// where duplicate values have been removed.

public class Exercise7 {

	public static void main(String[] args) {

		int[] array = { 1, 4, 10, 2, 2, 2, 5, 3, 3, 4, 2, 5, 5, 6, 7, 8, 9, 1, 10, 10, 10 };
		int[] unike = noRepeats(array);

		Arrays.sort(array);
		printArray(array);
		Arrays.sort(unike);
		printArray(unike);

	}

	public static int[] noRepeats(int t[]) {

		int[] temporalArray = new int[t.length];
		int position = 0;
		int duplicates = 0;

		// Boolean flag to know if a number is present in the temporal array.
		boolean present = false;

		// This segment of code eliminates duplicates but leaves 0 at the tail of the
		// array.

		// For each element in `t` array
		for (int element : t) {

			// flag reset.
			present = false;

			// Check the whole temporal array for coincidences.
			for (int i = 0; i < temporalArray.length && !present; i++) {

				if (element == temporalArray[i]) {
					present = true;
					duplicates++;
				}

			}

			// If the element has not been found then insert it.
			if (!present) {
				temporalArray[position] = element;
				position++;
			}

		}

		int[] newArray = Arrays.copyOf(temporalArray, (temporalArray.length - duplicates));

		return newArray;
	}

	// Function to print the array content.
	private static void printArray(int[] evenNumbersArray) {

		for (int i = 0; i < evenNumbersArray.length; i++) {

			System.out.printf(" | %02d ", evenNumbersArray[i]);

		}

		System.out.print("| \n");

	}

}
