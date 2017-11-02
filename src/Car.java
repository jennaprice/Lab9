
public class Car {

	private String carMake;
	private String carModel;
	private int year;
	double price;

	public Car() {

	}

	public Car(String carMake, String carModel, int year, double price) {
		this.carMake = carMake;
		this.carModel = carModel;
		this.year = year;
		this.price = price;
	}

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

}
