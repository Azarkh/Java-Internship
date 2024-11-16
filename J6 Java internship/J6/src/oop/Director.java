package oop;

public class Director {

	private String name;
	private String directorid;
	private String [] movies_directed;
	
	public Director() {
		this.name = this.directorid = "N/A";
		this.movies_directed = new String[0];
	}
	
	public Director(String name, String directorid, String [] movies_directed) {
		this.name = name;
		this.directorid = directorid;
		this.movies_directed = movies_directed;
	}
	
	//name
	public String getName() {
		return this.name;
	}
	
	public void setTitle(String name) {
		this.name = name;
	}
	
	//directorid
	public String getDirectorid() {
		return this.directorid;
	}
	
	public void setDirectorid(String directorid) {
		this.directorid = directorid;
	}
	
	//movies directed
	public String[] getMovies_directed() {
		return this.movies_directed;
	}
	
	public void setMovies_directed(String[] movies_directed) {
		this.movies_directed = movies_directed;
	}
	
	public String toString() {
		String str = "Director Details: \n" + "Name: " + this.name + "\nDirector Id: " + 
	                  this.directorid + "\nMovies Directed: \n";
		for(int i=0; i<this.movies_directed.length; i++) {
			str += this.movies_directed[i] + "\n";
		}
		return str;
	}

}
