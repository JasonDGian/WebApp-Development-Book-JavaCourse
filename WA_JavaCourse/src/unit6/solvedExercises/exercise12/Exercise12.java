package unit6.solvedExercises.exercise12;

import java.util.Arrays;
import java.util.Scanner;

// Write a program that asks the user for two words and 
// indicates if they are anagrams of each other.

public class Exercise12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean wordsNumberIsRight = false;
		String[] enteredWords;

		do {

			System.out.println("Enter two words to check (separate with a space):");
			String enteredSentence = sc.nextLine();

			enteredWords = enteredSentence.split(" ");

			if (enteredWords.length == 2) {
				wordsNumberIsRight = true;
			}

		} while (!wordsNumberIsRight);

		if (isAnagram(enteredWords[0], enteredWords[1])) {
			System.out.println("\n-------------------------\nThe words are anagrams.");
		}

		else {
			System.out.println("\n-------------------------\nThe words are NOT anagrams.");
		}

		sc.close();
	}

	static boolean isAnagram(String word1, String word2) {

		boolean isAnagram = true;

		// Turnn to lower to secure correct function of compareTo()
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();

		// Turn the strings into array of characters.
		char[] wordChar1 = word1.toCharArray();
		char[] wordChar2 = word2.toCharArray();

		// The first check is to see if the words are the same length.
		if (word1.length() == word2.length()) {

			Arrays.sort(wordChar1);
			Arrays.sort(wordChar2);

			for (int i = 0; i < wordChar1.length; i++) {

				// If the characters are not the same then turn the flag to false.
				if (Character.compare(wordChar1[i], wordChar2[i]) != 0) {
					isAnagram = false;
				}
			}
		}
		// If the words are not the same length they can't be anagram.
		else {
			isAnagram = false;
		}

		return isAnagram;
	}

}
