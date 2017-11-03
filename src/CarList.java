
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

	public static void main(String[] args) {
		int loopCount = 0;
		int carAdd = 0;
		String carMake, carModel;
		int year;
		double price;
		Scanner scnr = new Scanner(System.in);
		ArrayList<Car> availableCars = new ArrayList<Car>();

		System.out.println("Welcome to the Grand Circus Motors Admin Console!");
		while (Validator.continueProgram(scnr, loopCount)) {// loopCount makes sure it runs once
			// since the carList is on its own loop need to reinitialize every time we add a
			// car
			carAdd = 0;

			// similar loop but with its own prompt
			while (Validator.continueProgram(scnr, carAdd, "Would you like to add another car? ( y / n)?")) {
				carMake = Validator.getString(scnr, "Please enter the model of the car:");
				carModel = Validator.getString(scnr, "Please enter the model of the car:");
				year = Validator.getInt(scnr, "Please enter the year of the car:");
				price = Validator.getDouble(scnr, "Please enter the price of the car:");

				availableCars.add(new Car(carMake, carModel, year, price));// adding Car objects too array
				carAdd++;

			}
			loopCount++;
			System.out.println("Current Inventory:");
			availableCars.forEach(Car -> System.out.println(Car.toString()));
			System.out.println("Thank you for making a list of cars, you can make a new list if you would like.");
		}
		System.out.println("Thank you for playing!");
		scnr.close();
	}

}
