package unit3.solvedExercises.exercise10;

public class Exercise10 {

	public static void main(String[] args) {
		
		// Note: Calculating '(i * 2) - 1' we get the closest uneven number to the 'i' iterator. 

		int sumUnevenNumbers = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println(i + " -  " + ((i * 2) - 1));
			sumUnevenNumbers = sumUnevenNumbers + ((i * 2) - 1);

		}

		System.out.println("The sum of the first 10 uneven number is " + sumUnevenNumbers);
	}

}
