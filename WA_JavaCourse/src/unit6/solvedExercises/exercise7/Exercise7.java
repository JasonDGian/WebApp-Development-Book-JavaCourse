package unit6.solvedExercises.exercise7;

import java.util.Scanner;

/*
 * Design a program that asks the user for a sentence and a word. 
 * It will then search for how many times the word appears in the
 * sentence.
 */
public class Exercise7 {

	public static void main(String[] args) {

		// Scanner instance.
		Scanner sc = new Scanner(System.in);

		// Prompt the user for the sentence and word.
		System.out.println("Enter a sentence.");
		String sentence = sc.nextLine();

		System.out.println("Enter a word to search in the previously entered sentence.");
		String word = sc.nextLine();

		int appearances = searchWordInSentence( 
					normalizeString(sentence), normalizeString(word)
					);

		System.out.printf("The word '%s' appears %d time/s in the sentence.", word, appearances);

		sc.close();

	}

	static int searchWordInSentence(String sentence, String word) {

		int searchIndex = 0;
		int appearances = 0;
		boolean allWordsFound = false;

		while (!allWordsFound) {

			// Search the word appearance and store the index in which appears -1 is 'not
			// found'.
			int searchResult = sentence.indexOf(word, searchIndex);

			// If found.
			if (searchResult > -1) {

				searchIndex = searchResult + 1;
				appearances++;

			}
			// Else (word not found).
			else {
				allWordsFound = true;
			}
		}
		// Return number of times the word was found.
		return appearances;
	}

	// Returns the parameter string in lower case and without leading or tailing
	// spaces.
	static String normalizeString(String text) {
		return text.toLowerCase().strip();
	}

}
