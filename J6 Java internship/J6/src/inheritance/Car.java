package inheritance;

public class Car extends Vehicle {
	
	private int noOfseats;

	public Car(String make, String model, int year, String fueltype, double mileage, int noOfseats) {
		super(make, model, year, fueltype, mileage);
		this.noOfseats = noOfseats;
	}

	@Override
	public double calcFuelefficiency() {
		return mileage =  (1 / (1 + (this.noOfseats / 7.0)));
	}

	@Override
	public double getMaxspeed() {
		// TODO Auto-generated method stub
		return 120;
	}
	
	public void display() {
		System.out.println("-----Vehicle Data-----");
		System.out.println("Make : " + this.make);
		System.out.println("Model : " + this.model);
		System.out.println("Year : " + this.year);
		System.out.println("Fuel Type : " + this.fueltype);
		System.out.println("Mileage : " + this.mileage);
		System.out.println("Seats : " + this.noOfseats);
		System.out.println("Fuel Efficiency " + this.calcFuelefficiency());
		System.out.println("Max Speed: " + this.getMaxspeed());
	}

}
