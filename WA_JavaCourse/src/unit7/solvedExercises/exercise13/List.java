package unit7.solvedExercises.exercise13;

import java.util.Arrays;

public class List {

	private Integer[] numbers;
	
	
	public static List concatenate (List l1, List l2) {
		List l3 = new List();
		
		l3.append(l1);
		l3.append(l2);
		
		return l3;
	}
	

	// Empty constructor.
	public List() {
		numbers = new Integer[0];
	}

	public int length() {
		return numbers.length;
	}

	public void append(Integer number) {

		this.numbers = Arrays.copyOf(this.numbers, (this.numbers.length + 1));
		this.numbers[this.numbers.length - 1] = number;
	}

	public void append(List nums) {

		// creates a new copy with the length of the new list included.
		int initialSize = this.numbers.length;
		this.numbers = Arrays.copyOf(this.numbers, (this.numbers.length + nums.length()));

		System.arraycopy(nums.numbers, 0, this.numbers, initialSize, nums.numbers.length);

	}

	public void prefixInteger(Integer number) {

		this.numbers = Arrays.copyOf(this.numbers, this.numbers.length + 1);

		// Copies the numbers array within itself, starting to copy from index
		// 0 and pasting from index 1 the complete content.
		System.arraycopy(this.numbers, 0, this.numbers, 1, this.numbers.length - 1);

		// Reassigns the first element in the array to the parameter element.
		this.numbers[0] = number;

	}

	public Integer integerAtIndex(int index) {

		return numbers[index];

	}

	public int searchInteger(Integer number) {

		int index = 0;
		boolean found = false;

		for (int i = 0; i < this.numbers.length && !found; i++) {

			if (this.numbers[i].equals(number)) {
				index = i;
				found = true;
			} else {
				index = -1;
			}

		}

		return index;

	}

	public void print() {

		for (Integer number : this.numbers) {

			System.out.print(number + " ");
			;

		}

		System.out.println();
	}

	public void insertAtIndex(Integer num, int index) {

		// Makes a copy +1 in length
		Integer[] newArray = Arrays.copyOf(this.numbers, this.numbers.length + 1);

		for (int i = newArray.length - 1; i > index; i--) {

			newArray[i] = newArray[i - 1];

		}

		newArray[index] = num;

		this.numbers = newArray;

	}
	
	public Integer deleteElement( int index) {
		
		Integer deleted = null;
		
		if ( index >= 0 && index < this.numbers.length  ) {
			
			deleted = this.numbers[index];
		
			for ( int i = index ; i+1 < this.numbers.length ; i++ ) {
				
				this.numbers[i] = this.numbers[i+1];
				
			}
			
			// trim the last element.
			this.numbers = Arrays.copyOf(this.numbers, this.numbers.length-1);
			
			
			
		}

		
		return deleted;
	}

}
