package unit5.solvedExercises.exercise9;

import java.util.Arrays;

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
	
	
	
	private static int[] insertPlayerScore(int[] scoreboard, int playerScore) {
		

		// Stores the index for where the player score should be inserted.
		int insertIndex = Arrays.binarySearch(scoreboard, playerScore);
		
		
		return scoreboard;
	}

	public static void main(String[] args) {
		
//		// creamos el array 1
//		int[] scoreboard = new int[1];
//		System.out.println(scoreboard[0]);
//		
//		// valor a introducir en array.
//		int newScore = 100;
//		
//		// buscamos donde introducirlo
//		int newScoreIndex = Arrays.binarySearch(scoreboard, newScore);
//		
//		if ( newScoreIndex < 0 ) { newScoreIndex=-newScoreIndex-1;  }
//		
//		System.out.println(newScoreIndex);
//
//		int[] scoreboardCopy = new int[scoreboard.length+1];
//		
//		System.arraycopy(scoreboard, 0, scoreboardCopy, 0, newScoreIndex);
//		
//		for (int element: scoreboardCopy) {
//		System.out.println(element);
//		}
		
		
		int[] arrayA = {1,2,3};
		int[] arrayB = {4,5,6,7};
		
		int[] arrayAB =  new int[7];

		System.arraycopy(arrayA, 0, arrayAB, 0, arrayA.length);
		System.arraycopy(arrayB, 0, arrayAB, 3, arrayB.length);
		// Origin Array - Starting index in origin array - Destiny array - starting index in origin array - elements to copy
		
		for (int elemen: arrayAB) {
			System.out.println(elemen);
		}

		

	}

}
