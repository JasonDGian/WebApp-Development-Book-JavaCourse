package unit7.solvedExercises.exercise10;

import java.time.LocalDate;

import unit7.solvedExercises.exercise10.machinery.Locomotive;
import unit7.solvedExercises.exercise10.machinery.Train;
import unit7.solvedExercises.exercise10.personal.Mechanic;
import unit7.solvedExercises.exercise10.personal.Mechanic.Expertise;
import unit7.solvedExercises.exercise10.personal.TrainOperator;

/*
We have been tasked by a client to define the packages and necessary classes for managing a railway company. 
The company is divided into two main groups: Personnel and Machinery. 

In the Personnel group, all employees of the company are classified into three groups: train drivers, mechanics, and station masters. 
For each of these, it is necessary to store the following information:
- Train Drivers: their name, ID number, salary, and the rank they have attained.
- Mechanics: their name, phone number, and the specialty in which they work (Brakes, hydraulics, electricity, or engine).
- Station Masters: their name, ID number, and the date they were appointed as a station master.

In the Machinery section, we can find trains, locomotives, and wagons. For each of these, we need to consider:
- Wagons: They have an identifying number, maximum load capacity, current load, and the type of goods they carry.
- Locomotives: They have a registration number, engine power, and an age represented by their year of manufacture. Additionally, each locomotive is assigned a mechanic responsible for its maintenance.
- Trains: They consist of one locomotive and a maximum of 5 wagons. Each train has an assigned train driver responsible for it.

All classes related to personnel (train driver, mechanic, station master) will be public. Among the classes related to machinery, only external classes can construct objects of type TRAIN and LOCOMOTIVE. The WAGON class will only be visible to its neighboring classes.
*/
public class Exercise10 {

	public static void main(String[] args) {
		
		
		Mechanic mechanicJay = new Mechanic ("Jason", "616656376", Expertise.ENGINE);
		
		TrainOperator operatorDave = new TrainOperator("David","6271987", "Locomotive engineer", 70.000);
		
		Locomotive unionPacificBigBoy = new Locomotive("UPBB4884", 6000.00 , LocalDate.of(1941, 10, 5) , mechanicJay );
		
		Train orientExpress = new Train(operatorDave, unionPacificBigBoy );
		
		orientExpress.attachWagon(201, 50000, 10000.0, "Cargo");
		orientExpress.attachWagon(235, 25000, 18000, "Passangers");
		orientExpress.attachWagon(125, 25000, 18000, "Passangers");
		orientExpress.attachWagon(495, 30000, 18000, "Coal");
		orientExpress.attachWagon(698, 20000, 15400, "Livestock");
		orientExpress.attachWagon(691, 50000, 0, "Cargo");

		
		System.out.println( orientExpress.toString() );
		
		

		

	}
	

	
}
