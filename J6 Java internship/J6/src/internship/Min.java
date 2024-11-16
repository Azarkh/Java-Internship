package internship;

import java.util.Scanner;
public class Min 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter minutes : ");
		int n = sc.nextInt();
		
		int hour = n/60;
		int days = hour/24;
		int week = days/7;
		
		int lmin = n%60;
		int lhour = hour%24;
		int ldays = days%7;
		
		if( hour == 0 )
		{
			System.out.println("0 hour ");
		}
		
		else
		{
			System.out.print(hour + " hour ");
			System.out.println(lmin + " min");
		}
		
		if( days == 0 )
		{
			System.out.println("0 days ");
		}
		
		else
		{
			System.out.print(days + " days ");
			System.out.print(lhour + " hour ");
			System.out.println(lmin + " min");
		}
		
		if( week == 0 )
		{
			System.out.println("0 Week ");
		}
		
		else
		{
			System.out.print(week + " week ");
			System.out.print(ldays + " days ");
			System.out.print(lhour + " hour ");
			System.out.println(lmin + " min");
		}
		
	}
}
