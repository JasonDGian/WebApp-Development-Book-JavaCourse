package unit6.solvedExercises.exercise1;

public class Exercise1 {

	/*
	 * Write a program that displays all Unicode characters along with their code
	 * points, whose values are between \u0000 and \uFFFF.
	 */

	public static void main(String[] args) {

		
		
		for ( int codepoint = 0x000; codepoint < 0xFFFF ; codepoint++) {
			
			String character = Integer.toHexString(codepoint);
			
			System.out.println( "\\u" + character  + " - "+ (char)codepoint  );
			
		}
		
	}

}
