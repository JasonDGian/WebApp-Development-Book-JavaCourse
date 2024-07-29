package unit5.solvedExercises.exercise8;

import java.util.Arrays;
import java.util.Scanner;

/* 
 * Read and store N integers in an array, from which two other 
 * arrays will be constructed with the even and odd values from
 *  the first array, respectively. The arrays of even and odd 
 *  numbers must be displayed sorted.
 */
public class Exercise8 {

	// Function to check if number is even.
	public static boolean isEven(int num) {

		boolean isEven = false;

		if (num % 2 == 0) {
			isEven = true;
		}

		return isEven;
	}

	private static void printArray(int[] evenNumbersArray) {

		for (int i = 0; i < evenNumbersArray.length; i++) {

			System.out.printf(" | %d ", evenNumbersArray[i]);

		}

		System.out.print("| \n");

	}

	// Function that takes an array and returns a new array with only the even
	// values.
	static int[] getEvensArray(int[] original) {

		int[] evensArray = new int[0];

		for (int element : original) {

			if (isEven(element)) {

				evensArray = Arrays.copyOf(evensArray, (evensArray.length + 1));
				evensArray[evensArray.length - 1] = element;
			}

		}

		Arrays.sort(evensArray);
		return evensArray;

	}

	// Function that takes an array and returns a new array with only the uneven
	// values.
	static int[] getUnvensArray(int[] original) {

		int[] unevensArray = new int[0];

		for (int element : original) {

			if (!isEven(element)) {

				unevensArray = Arrays.copyOf(unevensArray, (unevensArray.length + 1));
				unevensArray[unevensArray.length - 1] = element;
			}

		}

		Arrays.sort(unevensArray);
		return unevensArray;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of integers you wish to record:");
		int size = sc.nextInt();
		int[] mixedArray = new int[size];

		for (int i = 0; i < size; i++) {

			System.out.printf("Enter the number: %d/%d \n", i, size);
			mixedArray[i] = sc.nextInt();

		}

		int[] evenArray = getEvensArray(mixedArray);
		int[] unevenArray = getUnvensArray(mixedArray);

		System.out.println("Original array:\n");
		printArray(mixedArray);

		System.out.println("Even numbers array:\n");
		printArray(evenArray);

		System.out.println("Uneven numbers array:\n");
		printArray(unevenArray);

		sc.close();

	}

}
