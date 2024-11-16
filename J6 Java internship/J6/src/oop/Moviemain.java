package oop;

import java.util.Scanner;
public class Moviemain {
	private static final int MAX_MOVIES = 50;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Movie[] m = new Movie[MAX_MOVIES];
		while(true) {
			System.out.println("\n-----Menu--- " + "\nCurrent Count: " +Movie.getCount());
			System.out.println("1) Add a movie");
			System.out.println("2) Get Details of Movie");
			System.out.println("3) See all Movies");
			System.out.println("4) Add a Review");
			System.out.println("5) See all Reviews");
			System.out.print("Choice(0 for exit):");

			
			int ch = sc.nextInt();
			if(ch == 0) {
				System.out.print("Exiting..... \n Thank You!");
				System.exit(0);
			}
			
			else if(ch == 1) {
				System.out.println("Adding a Movie");
				System.out.print("Title: ");
				String  Title = sc.next();
				System.out.print("Director: ");
				String Director = sc.next();
				System.out.print("No. of Actors: ");
				int na = sc.nextInt();
				String[] Actor = new String[na];
				System.out.print("Actors (Enter" + na + "): ");
				
				for(int i = 0; i < na ; i++) {
					Actor[i] = sc.next();
					}
				
				String [] reviews = {};
				m[Movie.getCount()] = new Movie(Title, Director, Actor, reviews);
				;System.out.print("Movie Created. Total Movies: " + Movie.getCount());
			}
			
			else if(ch == 2) {
				System.out.print("Title of Movie Search: ");
				String Title = sc.next();
				for(int i = 0; i < Movie.getCount(); i++) {
					if(m[i].getTitle().equals(Title)) {
						System.out.println(m[i]);
					}
				}
				}
					
			else if(ch == 3) {
				System.out.print("Movie Titles: ");
				for(int i = 0; i < Movie.getCount(); i++) {
					System.out.println(m[i].getTitle());
				}
			}
		}
}
}