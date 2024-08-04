package unit6.solvedExercises.exercise14;

import java.util.Random;
import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean win = false;

		System.out.println("Welcome to the anagram game!\nEnter a word to scramble:");
		String sentence = sc.nextLine().toLowerCase();

		String anagram = scrambleWord(sentence);

		System.out.println("The anagram you need to solve is: " + anagram);

		while (!win) {
			String answer = sc.nextLine().toLowerCase();

			if (sentence.compareTo(answer) == 0) {
				System.out.println("YOU WIN!");
				win = true;
			}

			else {
				System.out.println("Try again!");
			}
		}
		
		sc.close();

	}

	static String scrambleWord(String sentence) {

		Random generator = new Random();
		int indexB;
		char charAux;

		sentence = sentence.toLowerCase();
		char[] charArray = sentence.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			// Create two random indexes.
			indexB = generator.nextInt(charArray.length);

			// Store current iteration character in auxiliary variable.
			charAux = charArray[i];

			// exchange characters of place.
			charArray[i] = charArray[indexB];
			charArray[indexB] = charAux;

		}

		return String.valueOf(charArray);
	}

}
