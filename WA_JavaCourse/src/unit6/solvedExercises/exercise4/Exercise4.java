package unit6.solvedExercises.exercise4;

import java.util.Scanner;

/* 
 * Design an application that asks for a phrase using the 
 * keyboard and returns the number of whitespace characters 
 * it contains.
 */
public class Exercise4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence.");
		String sentence = sc.nextLine();

		int whitespaces = 0;

		for (int character = 0; character < sentence.length(); character++) {

			if (Character.isWhitespace(sentence.charAt(character))) {

				whitespaces++;
			}
		}

		System.out.println("There are " + whitespaces + " whitespaces in that sentence.");

		sc.close();
	}

}
