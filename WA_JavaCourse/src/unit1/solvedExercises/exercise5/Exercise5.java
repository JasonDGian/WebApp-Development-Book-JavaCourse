package unit1.solvedExercises.exercise5;

public class Exercise5 {

	public static void main(String[] args) {
		
		// Short primitives reach from -32768 to 32767
		// The idea is to cycle the value within the variable.
		
		// Method 1
		short myNum = 1;
		
		while (myNum != 0) {
			System.out.println(myNum);
			myNum++;
		} 
		
		// Method 2
		myNum = 32767;
		System.out.println("At the maximum value " + myNum);
		myNum++;
		System.out.println("After the increase of 1 " + myNum);

	}

}
