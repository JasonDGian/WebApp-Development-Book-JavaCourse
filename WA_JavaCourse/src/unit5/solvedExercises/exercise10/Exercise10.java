package unit5.solvedExercises.exercise10;

import java.util.Arrays;

/*
 * Write the function: 'int[] deleteGreater(int[] array, int value)'
 * which creates and returns a copy of the array where the 
 * elements that are greater than 'value' have been removed.
 */

public class Exercise10 {

	// Method 1.
	public static int[] deleteGreater(int[] array, int value) {

		int valuesToDelete = 0;

		for (int element : array) {

			if (element > value) {
				valuesToDelete++;
			}

		}

		int[] newArray = new int[array.length - valuesToDelete];
		int index = 0;

		for (int element : array) {

			if (element <= value) {
				newArray[index] = element;
				index++;
			}

		}

		return newArray;

	}

	// Method 2.

	public static int[] deleteGreaterCP(int[] array, int value) {

		int[] newArray = new int[0];
		int index = 0;

		for (int element : array) {

			if (element <= value) {
				newArray = Arrays.copyOf(newArray, newArray.length + 1);
				newArray[index] = element;
				index++;
			}

		}

		return newArray;

	}

	// Method 3
	public static int[] deleteGreaterByTheBook(int array[], int value) {

		int[] newArray = Arrays.copyOf(array, array.length);
		int index = 0;

		while (index < newArray.length) {

			if (newArray[index] > value) {
				newArray[index] = newArray[newArray.length - 1];
				newArray = Arrays.copyOf(newArray, newArray.length - 1);
			}
			else {
				index++;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {

		int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(Arrays.toString(testArray));
		testArray = deleteGreater(testArray, 5);
		System.out.println(Arrays.toString(testArray));

		int[] testArray2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(testArray2));
		testArray2 = deleteGreaterCP(testArray2, 5);
		System.out.println(Arrays.toString(testArray2));
		
		
		int[] testArray3 = { 20, 11, 12, 13, 14, 15, 16, 17, 1 };
		System.out.println(Arrays.toString(testArray3));
		testArray3 = deleteGreaterByTheBook(testArray3, 14);
		System.out.println(Arrays.toString(testArray3));

	}

}
