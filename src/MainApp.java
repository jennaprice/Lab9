
/**
* CarList
*@see java.lang.Object
*@author Jenna Price
*@version 1.0
*Date: Nov/01/2017
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int loopCount = 0;
		int loopCount2 = 0;
		int carSelection;
		// int year;
		// double price;
		Scanner scnr = new Scanner(System.in);
		FileInputStream fileByteStream;
		Scanner inFS = null;
		CarList carInventory = new CarList();

		try {
			fileByteStream = new FileInputStream("newcars.txt");
			inFS = new Scanner(fileByteStream);
		} catch (IOException e) {

			System.out.println("There was a problem with your file please check and try again.");
			e.printStackTrace();
			return;
		}

		carInventory.addNewCars(inFS);

		try {
			fileByteStream = new FileInputStream("usedcars.txt");
			inFS = new Scanner(fileByteStream);
		} catch (IOException e) {

			System.out.println("There was a problem with your file please check and try again.");
			e.printStackTrace();
			return;
		}
		carInventory.addUsedCars(inFS);

		System.out.println("Welcome to the Grand Circus Motors Admin Console!");
		while (Validator.doOnceContinueProgram(scnr, loopCount, "Would you like to choose a car? (y/n)", "y")) {// loopCount
			// makes
			// sure itValidator.continueProgram(scnr, loopCount, "Would you like to choose a
			// car? (y/n)", "y")
			// runs once
			loopCount++;
			System.out.println("Current Inventory:");
			System.out.println(carInventory.toString());
			carSelection = Validator.getInt(scnr, "Which car would you like to look at:");
			if (carSelection <= carInventory.getForSaleCars().size()) {
				System.out.println(carInventory.getForSaleCars().get(carSelection - 1).toString());
			} else {
				break;
			}
			if (Validator.continueProgram(scnr, "Would you like to buy this car? (y/n)", "y")) {
				System.out.println("Fantastic, our finance department will be in touch!");
				carInventory.getForSaleCars().remove(carSelection - 1);

			}

		}
		System.out.println("Thank you for playing!");
		scnr.close();
		inFS.close();
	}

}
