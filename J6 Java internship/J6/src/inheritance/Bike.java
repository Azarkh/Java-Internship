package inheritance;

public class Bike extends Vehicle {
	
	private int EngineDisplacement;

	public Bike(String make, String model, int year, String fueltype, double mileage, int EngineDisplacement) {
		super(make, model, year, fueltype, mileage);
		this.EngineDisplacement = EngineDisplacement;
	}

	@Override
	public double calcFuelefficiency() {
		return mileage =  (1 / (1 + (this.EngineDisplacement / 1000)));
	}

	@Override
	public double getMaxspeed() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	public void display() {
		System.out.println("-----Vehicle Data-----");
		System.out.println("Make : " + this.make);
		System.out.println("Model : " + this.model);
		System.out.println("Year : " + this.year);
		System.out.println("Fuel Type : " + this.fueltype);
		System.out.println("Mileage : " + this.mileage);
		System.out.println("EngineDisplacement : " + this.EngineDisplacement);
		System.out.println("Fuel Efficiency " + this.calcFuelefficiency());
		System.out.println("Max Speed: " + this.getMaxspeed());
	}

}