package internship;

import java.util.Scanner;
public class Integer 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		
		while(true)
		{
			if(n > 0)
			{
			System.out.print("Sum : " + sum);
			break;
			}
			
			else
			{
				sum += n;
				System.out.print("Enter a Number : ");
				n = sc.nextInt();
			}
		}
	}
}