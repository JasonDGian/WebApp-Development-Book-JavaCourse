package unit6.solvedExercises.exercise13;

/*
 * Design an algorithm that reads a phrase from the keyboard and indicates, 
 * for each letter that appears in the phrase, how many times it repeats. 
 * Uppercase and lowercase letters are considered the same for the count.
 */

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence:");
		String sentence = sc.nextLine().toLowerCase();

		int[] counter = new int['z' - 'a' + 1]; // This length asignation asures every possible letter has a space by
												// using their unicode value.

		for (int i = 0; i < sentence.length(); i++) {

			if (Character.isLetter(sentence.charAt(i))) {

				// increments the given character
				counter[sentence.charAt(i) - 'a']++;

			}

		}

		for (int i = 0; i < 'z' - 'a' + 1; i++) {
			if (counter[i] > 0) {

				System.out.println(
						"The letter '" + (char) (i + 'a') + "' appears " + counter[i] + " times, within the sentence.");

			}

		}
		
		sc.close();

	}

}
