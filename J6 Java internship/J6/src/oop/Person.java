package oop;
public class Person {
	
	private int yob;
	private String id, name;
	
	private static final int Voting_age = 18;

	public Person() {
		
		this.name = this.id = "N/A";
		this.yob = 0;
		
	}
	
	public Person(String id) {
		this.id = id;
		this.name = "N/A";
		this.yob = 0;
	}
	
	public Person(String id, String name, int yob) {
		this.name = name;
		this.id = id;
		this.yob = yob;
	}
	
	private int calcAge() {
		int year = 2024;
		return year - yob;
	}
	
	public boolean canvote() {
		return (this.calcAge() >= this.Voting_age);
	}
	
	public String toString() {
		return "Person Data:\nName: " +
	            this.name + "\nID: " + this.id
	            + "\nAge: " + this.calcAge() + "\n\n";
	}

}
