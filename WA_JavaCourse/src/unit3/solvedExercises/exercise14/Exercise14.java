package unit3.solvedExercises.exercise14;

public class Exercise14 {

	public static void main(String[] args) {
		// Make use of nested loops.

		for (int number = 1; number <= 10; number++) {
			System.out.println("--------------------------------");
			System.out.println("- Multiplication table for " + number + " -");
			System.out.println("--------------------------------");

			for (int multiplier = 1; multiplier <= 10; multiplier++) {

				System.out.printf("%d * %d = %d\n", number, multiplier, (number * multiplier));

			}

		}

	}

}
