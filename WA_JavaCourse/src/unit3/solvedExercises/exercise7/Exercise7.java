package unit3.solvedExercises.exercise7;

public class Exercise7 {

	public static void main(String[] args) {
		// Print on screen all multiples of 7

		for (int i = 0; i < 100; i++) {

			if (i % 7 == 0) {
				System.out.println(i);
			}

		}
		
		// Method 2.
		// Perhaps more efficient?
		System.out.println( "-".repeat(40) );
		for (int i = 0 ; i < 100 ; i=i+7) {
			
			System.out.println(i);
			
		}

	}

}
