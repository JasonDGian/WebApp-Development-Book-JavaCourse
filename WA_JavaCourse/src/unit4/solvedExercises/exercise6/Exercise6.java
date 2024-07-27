package unit4.solvedExercises.exercise6;

// Design a function with the following prototype:
// boolean isPrime(int n)
// that returns true if n is prime and false otherwise.

public class Exercise6 {

	public static boolean isPrime(int n) {

		boolean isPrime = true;

		// Negative numbers, along with 0 and 1, do not qualify as prime numbers. The
		// concept of primality is only applicable to positive integers greater than 1.
		if (n < 2) {
			isPrime = false;
		} else {

			// Check if n is prime.
			for (int i = 2; i <= (n / 2); i++) {
				if ((n % i) == 0 || n < 2) {
					isPrime = false;
				}
			}
		}

		return isPrime;
	}

	public static void main(String[] args) {

		for (int i = -10; i < 20; i++) {
			System.out.println(i + " is prime: " + isPrime(i));
		}

	}

}
