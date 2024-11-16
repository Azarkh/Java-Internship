package inheritance;

public class Truck extends Vehicle {
	
	private int cargocapacity;

	public Truck(String make, String model, int year, String fueltype, double mileage, int cargocapacity) {
		super(make, model, year, fueltype, mileage);
		this.cargocapacity = cargocapacity;
	}

	@Override
	public double calcFuelefficiency() {
		return mileage =  (1 / (1 + (this.cargocapacity / 1000)));
	}

	@Override
	public double getMaxspeed() {
		// TODO Auto-generated method stub
		return 80;
	}
	
	public void display() {
		System.out.println("-----Vehicle Data-----");
		System.out.println("Make : " + this.make);
		System.out.println("Model : " + this.model);
		System.out.println("Year : " + this.year);
		System.out.println("Fuel Type : " + this.fueltype);
		System.out.println("Mileage : " + this.mileage);
		System.out.println("Cargo : " + this.cargocapacity);
		System.out.println("Fuel Efficiency " + this.calcFuelefficiency());
		System.out.println("Max Speed: " + this.getMaxspeed());
	}

}