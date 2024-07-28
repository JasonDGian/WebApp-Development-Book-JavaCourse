package unit5.solvedExercises.exercise4;

// Design the function maxValue(int t[]) that returns the
// maximum value contained in the array 't'."

public class Exercise4 {

	
	public static int maxValue(int[] t) {

		// Stores the maximum value found within the array.
		int max = t[0];

		// Loop that checks each value stored.
		for (int i = 0; i < t.length; i++) {
			if (t[i] > max) {
				max = t[i];
			}
		}
		
		// Returns the value found.
		return max;

	}

	public static void main(String[] args) {

		// Creates an array of values.
		int[] valuesArray = { 10, 25, 34, 87, 123, 0 };

		// Reports on the console.
		System.out.println("The maximum value within the table is: " + maxValue(valuesArray));

	}

}
