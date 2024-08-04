package unit6.solvedExercises.exercise15;

import java.util.Random;
import java.util.Scanner;

/*
 *  Modify the previous activity so that the program indicates to
 *  player 2 how many letters match (are the same and in the same 
 *  position) between the text they entered and the correct answer.
 */

public class Exercise15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean win = false;

		System.out.println("Welcome to the anagram game!\nEnter a word to scramble:");
		String sentence = sc.nextLine().toLowerCase();

		String anagram = scrambleWord(sentence);

		System.out.println("The anagram you need to solve is: " + anagram);

		while (!win) {
			String answer = sc.nextLine().toLowerCase();
			checkCoincidence(sentence, answer);

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

	static void checkCoincidence(String sentence, String answer) {

		char[] characters = sentence.toCharArray();

		for (int i = 0; i < characters.length; i++) {

			char a = characters[i];
			char c = answer.charAt(i);

			if (Character.compare(a, c) == 0) {
				System.out.print("* ");
			}

			else {
				System.out.print("_ ");
			}

		}

		System.out.println();

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
