package unit7.solvedExercises.exercise13;

public class Exercise13 {
	
	/*
	 * Implement the `Pile` class for `Integer` numbers,
	 * using a list from the previous activity 
	 * to store the stacked elements.
	 */
	public static void main(String[] args) {
		
		Pile myPile = new Pile();
		
		myPile.stack(1);
		myPile.stack(2);
		myPile.stack(3);
		
		myPile.print();
		
		myPile.unstack();
		
		myPile.print();

	}

}
