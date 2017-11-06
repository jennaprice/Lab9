/**
 * Used Car Object Class
 * 
 * @see java.lang.Object
 * @author Jenna Price
 * @version 1.0 Date: Nov/02/2017
 */
public class UsedCar extends Car {

	private double mileage;

	// empty constructor
	public UsedCar() {
		super();
		mileage = 0.0;

	}

	public UsedCar(String carMake, String carModel, int year, double price, double mileage) {
		super(carMake, carModel, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override // Overidden toString that returns one long String
	public String toString() {
		String carInfo = super.toString() + " \tMileage: " + mileage + " (Used)";
		return carInfo;
	}
}
