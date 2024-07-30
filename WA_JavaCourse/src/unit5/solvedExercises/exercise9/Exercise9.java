package unit5.solvedExercises.exercise9;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Design an application to manage a programming championship, 
 * where scores are entered as integers obtained by 5 programmers
 * as they finish their tests. The application should display the 
 * scores sorted for the 5 participants. Occasionally, when the 
 * previous 5 programmers have finished, exhibition programmers 
 * join the championship, and their scores are included with the
 * rest. The way to specify that no more exhibition programmers 
 * are involved is by entering a score of -1. The application 
 * should finally display the sorted scores of all participants.
 */
public class Exercise9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int score[] = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.printf("Enter the %d player's score:\n", (i + 1));
			score[i] = sc.nextInt();

		}

		Arrays.sort(score);
		System.out.printf("Scoreboard: " + Arrays.toString(score));

		System.out.println("\nExhibition programmer's score: \n Enter -1 to exit this insertion.");
		int scoreExhProgr = sc.nextInt();

		while (scoreExhProgr != -1) {

			int positionInArray = Arrays.binarySearch(score, scoreExhProgr);
			int indexOfInsertion;

			if (positionInArray < 0) {
				indexOfInsertion = -positionInArray - 1;
			}

			else {
				indexOfInsertion = positionInArray;
			}

			int[] scoreCopy = new int[score.length + 1];

			System.arraycopy(score, 0, scoreCopy, 0, indexOfInsertion);

			System.arraycopy(score, indexOfInsertion, scoreCopy, indexOfInsertion + 1, score.length - indexOfInsertion);

			scoreCopy[indexOfInsertion] = scoreExhProgr;
			score = scoreCopy;

			System.out.println("Exhibition programmer's score: \n Enter -1 to exit this insertion.");
			scoreExhProgr = sc.nextInt();

		}

		System.out.println("The final scoreboard is: " + Arrays.toString(score));
		sc.close();

	}

}
