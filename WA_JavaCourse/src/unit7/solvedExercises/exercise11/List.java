package unit7.solvedExercises.exercise11;

import java.util.Arrays;

public class List {

	private Integer[] numbers;

	// Empty constructor.
	public List() {
		numbers = new Integer[0];
	}

	public int length() {
		return numbers.length;
	}

	public void appendInteger(Integer number) {

		// copy original array with 1 extra slot
		Integer[] numbersCopy = Arrays.copyOf(numbers, (numbers.length + 1));

		numbersCopy[numbersCopy.length - 1] = number;

		this.numbers = numbersCopy;
	}

	public void prefixInteger(Integer number) {

		Integer[] newArray = Arrays.copyOf(numbers, this.numbers.length + 1);

		// Move all elements one position to the right.
		for (int i = newArray.length - 1; i > 0; i--) {

			newArray[i] = newArray[i - 1];
		}

		newArray[0] = number;

		this.numbers = newArray;

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

	public void appendIntegerArray(List nums) {

		for (Integer num : nums.numbers) {
			appendInteger(num);
		}

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

}
