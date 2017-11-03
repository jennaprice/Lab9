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
		while (Validator.continueProgram(scnr, loopCount)) {

			carAdd = 0;
			while (Validator.continueProgram(scnr, carAdd, "Would you like to add another car? ( y / n)?")) {
				carMake = Validator.getString(scnr, "Please enter the make of the car:");
				carModel = Validator.getString(scnr, "Please enter the model of the car:");
				year = Validator.getInt(scnr, "Please enter the year of the car:");
				price = Validator.getDouble(scnr, "Please enter the price of the car:");

				availableCars.add(new Car(carMake, carModel, year, price));
				carAdd++;

			}
			loopCount++;
			availableCars.forEach(Car -> System.out.println(Car.toString()));
			System.out.println("Thank you for making a list of cars, you can make a new list if you would like.");
		}
		System.out.println("Thank you for playing!");
		scnr.close();
	}

}
