
/**
* CarList
*@see java.lang.Object
*@author Jenna Price
*@version 1.0
*Date: Nov/01/2017
*/
import java.util.ArrayList;
import java.util.Scanner;

public class CarList {

	private ArrayList<Car> forSaleCars;

	public CarList() {
		setForSaleCars(new ArrayList<Car>());
	}

	public ArrayList<Car> getForSaleCars() {
		return forSaleCars;
	}

	public void setForSaleCars(ArrayList<Car> forSaleCars) {
		this.forSaleCars = forSaleCars;

	}

	public void addNewCars(Scanner inFS) {

		String make, model;
		double price;
		int year;
		while (inFS.hasNextLine()) {

			make = inFS.nextLine();
			model = inFS.nextLine();
			year = Integer.parseInt(inFS.nextLine());
			price = Double.parseDouble(inFS.nextLine());
			forSaleCars.add(new Car(make, model, year, price));
		}
	}

	public void addUsedCars(Scanner inFS) {

		String make, model; // testString;
		double price, mileage;
		int year;
		while (inFS.hasNextLine()) {

			make = inFS.nextLine();
			model = inFS.nextLine();
			// testString = ;
			year = Integer.parseInt(inFS.nextLine());
			// System.out.println("price " + inFS.hasNextLine());
			price = Double.parseDouble(inFS.nextLine());
			// System.out.println("mileage " + inFS.hasNextLine());
			mileage = Double.parseDouble(inFS.nextLine());
			forSaleCars.add(new UsedCar(make, model, year, price, mileage));
		}
	}

	@Override
	public String toString() {
		String message = "";
		int i = 0;
		for (i = 0; i < forSaleCars.size(); i++) {
			/*
			 * if (forSaleCars.get(i).getClass().isInstance(new Car())) {
			 * System.out.println("hahaha I cant belive that worked!"); message =
			 * forSaleCars.get(i).toString(); } else {
			 * System.out.println("You need to find a better way to do this."); }
			 */
			message = message + "\n" + (i + 1) + ") " + forSaleCars.get(i).toString();
		}
		int placeholder = i + 1;
		message = message + "\n" + placeholder + ") Quit";
		return message;
	}

}
