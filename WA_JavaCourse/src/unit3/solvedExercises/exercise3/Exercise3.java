package unit3.solvedExercises.exercise3;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random generator = new Random();

		int guess, secretNumber;
		int tries = 0;
		secretNumber = generator.nextInt(100);

		do {
			tries++;

			System.out.println("Enter your guess.  | Try n: " + tries);
			guess = sc.nextInt();

			if (guess == secretNumber) {
				System.out.println("THAT'S IT! Congratulations.");
			}

			if (guess > secretNumber) {
				System.out.println("Too high!");
			}

			if (guess < secretNumber) {
				System.out.println("Too low!");
			}

		} while (guess != secretNumber);

		sc.close();

	}

}
