package internship;

import java.util.Scanner;
import java.lang.String;

public class Palindrome 
{
	public static void main(String [] args)
	{
		int i;
		String ch = "";
		System.out.print("Enter : ");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
	
		for(i = n.length()-1; i>=0; i--)
		{
			ch = ch + n.charAt(i);
			System.out.println(ch);
		}
		
		if(ch == n)
		{
			System.out.println("It is a Palindrome");
		}
		
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}
}