package unit5.solvedExercises.exercise12;

import java.util.Arrays;

/* 
 * Create a 5x5 two-dimensional array and fill it in the following way: 
 * The element at position [n][m] should contain the value 10 * n + m. 
 * Then, display its content.
 */
public class Exercise12 {

	public static void main(String[] args) {

		int[][] table = new int[5][5];

		for (int column = 0; column < 5; column++) {

			for (int row = 0; row < 5; row++) {

				table[column][row] = 10 * column + row;

			}

		}

		// Method 1 of printing.
		System.out.println(Arrays.deepToString(table) + "\n");

		// Method 2 of printing.
		printMatrix(table);

	}

	private static void printMatrix(int[][] table) {

		System.out.println("--------------------------");

		for (int column = 0; column < 5; column++) {

			for (int row = 0; row < 5; row++) {

				System.out.printf("| %02d ", table[column][row]);
			}

			System.out.println("|");
			System.out.println("--------------------------");
		}

	}

}
