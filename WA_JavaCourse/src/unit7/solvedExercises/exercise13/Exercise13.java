package unit7.solvedExercises.exercise13;

public class Exercise13 {

	/*
	 * Implement the `Pile` class for `Integer` numbers, using a list from the
	 * previous activity to store the stacked elements.
	 */
	public static void main(String[] args) {

		Pile myPile = new Pile();

		for (int i = 0; i < 5; i++) {
			myPile.stack(i + 1);
		}

		myPile.print();

		myPile.unstack();

		myPile.print();

		myPile.unstack();

		myPile.print();

	}

}
