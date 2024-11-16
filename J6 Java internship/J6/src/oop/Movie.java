package oop;

public class Movie {
	
	private String Title;
	private String Director;
	private String [] Actor;
	private String [] reviews;
	
	private static int COUNT = 0;
	private final int MAX_REVIEWS = 10;
	private final int MAX_ACTORS = 5;

	public Movie() {
		this.Title = this.Director = "N/A";
		this.Actor = new String[0];
		this.reviews = new String[MAX_REVIEWS];
	}
	
	public Movie(String Title, String Director, String [] Actor, String[] reviews) {
		this.Title = Title;
		this.Director = Director;
		this.Actor = Actor;
		this.reviews = reviews;
		this.COUNT++;
	}
	
	//Title
	public String getTitle() {
		return this.Title;
	}
	
	public void setTitle(String Title) {
		this.Title = Title;
	}
	
	//Director
	public String getDirector() {
		return this.Director;
	}
	
	public void setDirector(String Director) {
		this.Director = Director;
	}
	
	//Actor
	public String[] getActor() {
		return this.Actor;
	}
	
	public void setActor(String [] Actor) {
		this.Actor = Actor;
	}
	
	//Reviews
	public String[] getReviews() {
		return this.reviews;
	}
	
	public void setReviews(String [] reviews) {
		this.reviews = reviews;
	}
	
	//Count
	public static int getCount() {
		return COUNT;
	}
	
	public String toString() {
		String str = "Movie Details: \n" + "Title: " + this.Title + "\nDirector: " + 
	                  this.Director + "\nActors: \n";
		for(int i=0; i<this.Actor.length; i++) {
			str += this.Actor[i] + "\n";
		}
		return str;
	}


}
