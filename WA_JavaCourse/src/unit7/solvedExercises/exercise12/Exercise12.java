package unit7.solvedExercises.exercise12;

/*
Add the following static method to the `Lista` class:
Lista concatena(Lista l1, Lista l2);
This method constructs and returns a list that contains, in the same order, a copy of all the elements from `l1` and `l2`.
*/

public class Exercise12 {

	public static void main(String[] args) {

		// A constructor that initializes the array to size 0.
		List myList = new List();
		List myList2 = new List();

		myList.append(1);
		myList.append(2);
		myList.append(3);
		myList.append(4);
		
		myList.print();

		myList2.append(5);
		myList2.append(6);
		myList2.append(7);
		
		myList2.print();

		List myList3 = List.concatenate(myList, myList2);

		myList3.print();

	}

}
