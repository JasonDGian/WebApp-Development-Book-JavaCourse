package unit4.solvedExercises.exercise7;

import java.util.Scanner;

// Write a function that takes an integer and returns the number of prime divisors it has.

public class Exercise7 {

	// Reusing the last exercise's function.
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

	public static int getDivisors(int number) {
		// To test application:
		// 210 is divisible by 2 3 5 7
		// 30 is divisible by 2 3 5
		// 42 is divisible by 2 3 7

		int counter = 0;

		for (int i = 1; i <= (number / 2); i++) {

			if ( isPrime(i) && number % i == 0 ) {
				counter++;
			}

		}

		return counter;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to find the prime divisors:");
		System.out.println("The number of prime divisors is : " + getDivisors(sc.nextInt()));

		sc.close();

	}

}
