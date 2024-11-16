package inheritance;

public abstract class Vehicle {
	
	protected String make;
	protected String model;
	protected int year;
	protected String fueltype;
	protected double mileage;
	
	public Vehicle(String make, String model, int year, String fueltype, double mileage) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fueltype = fueltype;
		this.mileage = mileage;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFueltype() {
		return this.fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	
	public double mileage() {
		return this.mileage;
	}

	public void mileage(double mileage) {
		this.mileage = mileage;
	}
	
	public abstract double calcFuelefficiency ();
	public abstract double getMaxspeed ();
	
	public void display() {
		System.out.println("-----Vehicle Data-----");
		System.out.println("Make : " + this.make);
		System.out.println("Model : " + this.model);
		System.out.println("Year : " + this.year);
		System.out.println("Fuel Type : " + this.fueltype);
		System.out.println("Mileage : " + this.mileage);
	}
	
}
