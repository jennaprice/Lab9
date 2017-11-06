/**
 * Car Object Class
 * 
 * @see java.lang.Object
 * @author Jenna Price
 * @version 1.0 Date: Nov/01/2017
 */
public class Car {

	private String carMake;
	private String carModel;
	private int year;
	double price;

	// empty constructor
	public Car() {
		carMake = "";
		carModel = "";
		year = 0;
		price = 0.0;
	}

	public Car(String carMake, String carModel, int year, double price) {
		this.carMake = carMake;
		this.carModel = carModel;
		this.year = year;
		this.price = price;
	}

	// Generated Getters and Setters
	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override // Overidden toString that returns one long String
	public String toString() {
		String carInfo = carMake + " " + carModel + " " + Integer.toString(year) + " $" + Double.toString(price);
		return carInfo;
	}
}
