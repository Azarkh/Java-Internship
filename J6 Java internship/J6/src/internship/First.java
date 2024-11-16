package internship;

import java.util.Scanner;
public class First 
{
	public static void main(String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Number: ");
			int n = sc.nextInt ();

			System.out.println(n + " * 1 = " + n*1);
			System.out.println(n + " * 2 = " + n*2);
			System.out.println(n + " * 3 = " + n*3);
			System.out.println(n + " * 4 = " + n*4);
			System.out.println(n + " * 5 = " + n*5);
		}
	}
}
