package unit7.solvedExercises.exercise13;

public class Pile {

	List list = new List();

	public void stack(Integer num) {
		this.list.append(num);
	}

	public void unstack() {
		this.list.deleteElement( this.list.length()-1 );
	}

	public void print() {
		this.list.print();
	}
}
