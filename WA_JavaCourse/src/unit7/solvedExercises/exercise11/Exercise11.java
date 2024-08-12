package unit7.solvedExercises.exercise11;


/*
Lists are dynamic data structures where elements of a certain type can be inserted or removed without limitation on space.
Implement the class `Lista` corresponding to a list of numbers of the `Integer` class. The numbers will be stored in an array that will be resized with insertions and deletions, increasing or decreasing the capacity of the list as needed. The methods of the class will include the following tasks:
- A constructor that initializes the array to size 0.
- Get the number of elements inserted in the list.
- Insert a number at the end of the list.
- Insert a number at the beginning of the list.
- Insert a number at a specific position in the list, where the index is passed as a parameter.
- Add to the end of the list the elements of another list passed as a parameter.
- Retrieve the element at a specified index passed as a parameter.
- Search for a number in the list, returning the index of the first occurrence, or -1 if not found.
- Display the elements of the list on the console.
*/

public class Exercise11 {
	
	public static void main(String[] args) {
		
	
		// A constructor that initializes the array to size 0.
		List myList = new List();
		List myList2 = new List();
	
		// Get the number of elements inserted in the list.
		myList.length();
	
		// Insert a number at the end of the list.
		myList.append(1);
		myList.append(2);
		myList.append(3);
		myList.append(4);
				
		myList2.append(7);
		myList2.append(8);
		myList2.append(9);

	
		// Insert a number at the beginning of the list.
		myList2.prefixInteger(5);
		myList2.prefixInteger(6);
	
	
		// Add to the end of the list the elements of another list passed as a parameter.
		myList.append( myList2 );
		
		
		// Retrieve the element at a specified index passed as a parameter.
		myList.integerAtIndex(1);
	
		// Search for a number in the list, returning the index of the first occurrence, or -1 if not found.
		myList.searchInteger(99);
	
		// Display the elements of the list on the console.
		myList.print();
		
		// Insert a number at a specific position in the list, where the index is passed as a parameter.
		myList.insertAtIndex(100,0);
		myList.insertAtIndex(300,2);
		
		myList.print();
		
		myList.deleteElement(0);
		
		myList.print();
		
		myList.deleteElement(1);
		
		myList.print();
		

	}

}
