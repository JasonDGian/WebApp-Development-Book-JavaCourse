package unit3.solvedExercises.exercise5;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random generator = new Random();

		int rand1, rand2;
		int userGuess, correctAnswer;
		int operations = 0;

		System.out.println("Welcome to the mental addition game!");
		System.out.println(
				"You will receive two random numbers and you will have to add them up in your head.\n Enter the right solution and keep going!");

		do {

			rand1 = generator.nextInt(100);
			rand2 = generator.nextInt(100);
			correctAnswer = rand1 + rand2;

			System.out.printf("Calculate this: %d + %d\n", rand1, rand2);
			userGuess = sc.nextInt();
			
			if (userGuess == correctAnswer) {
				System.out.println("That's right!!");
				operations++;
			} 


		} while (userGuess == correctAnswer);

		System.out.printf("You solved %d operations.", operations);
		sc.close();
	}

}
