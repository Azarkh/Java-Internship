package inheritance;

import java.util.Scanner;

public class GarageMain {

	public static void main(String[] args) {
		/*Car c = new Car("BMW", "M5", 2019, "Petrol", 10, 4);
		Truck t = new Truck("Ford", "Raptor", 2018, "Diesel", 15, 700);
		Bike b = new Bike("Kawasaki", "Ninja H2r", 2008, "Petrol", 10, 100);
		
		c.display();
		t.display();
		b.display();*/
		
		/*Vehicle [] v = new Vehicle[3];
		v[0] = new Car("BMW", "M5", 2019, "Petrol", 10, 4);
		v[1] = new Truck("Ford", "Raptor", 2018, "Diesel", 15, 700);
		v[2] = new Bike("Kawasaki", "Ninja H2r", 2008, "Petrol", 10, 100);
		
		for(int i = 0; i < 3 ; i++) {
			v[i].display();
		}*/
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n-----Menu--- " );
			System.out.println("1) Add a Vehicle");
			System.out.println("2) View all Cars");
			System.out.println("3) View all Bikes");
			System.out.println("4) View all Trucks");
			System.out.println("5) Search For a Vehicle by Year");
			System.out.print("Choice(0 for exit):");

			
			int ch = sc.nextInt();
			String make = null , model = null , fueltype = null;
			int year = 0 , noOfseats = 0;
			double mileage = 0;
			Vehicle [] v = new Vehicle[3];
			
			if(ch == 0) {
				System.out.print("Exiting..... \n Thank You!");
				System.exit(0);
			}
			
			else if(ch == 1) {
				System.out.println("\n-----Menu--- " );
				System.out.println("1) Add a Car");
				System.out.println("2) Add a Bike");
				System.out.println("3) Add a Truck");
				System.out.print("Choice(0 for exit):");
				int cha = sc.nextInt();
				
				if (cha == 1) {
					System.out.println("Adding a Car");
					System.out.print("Make: ");
					make = sc.next();
					System.out.print("Year: ");
					year = sc.nextInt();
					System.out.print("Model:  ");
					model = sc.next();
					System.out.print("Fuel Type:  ");
					fueltype = sc.next();
					System.out.print("No of Seats:  ");
					noOfseats = sc.nextInt();
					System.out.print("Mileage:  ");
					mileage = sc.nextInt();
					
					v[0] = new Car(make, model, year, fueltype, mileage, noOfseats);
					v[0].display();
					System.out.println("Car is Added Successfully");
				}
			}
			
			else if(ch == 2) {
				
				System.out.println("Printing All Cars...........");
				v[0].display();
				
				}
					
			else if(ch == 3) {
				
				}
			}
		}

}

