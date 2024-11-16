package internship;

import java.util.Scanner;
public class PersonalInfo 
{
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String a = sc.nextLine();
		System.out.print("Enter Age: ");
		int b = sc.nextInt();
		System.out.print("Enter Email: ");
		String c = sc.next();
		System.out.print("Enter Address: ");
		String d = sc.nextLine();
		System.out.print("Enter Phone no: ");
		String e = sc.next();
		System.out.println("\n");

		System.out.println("----------Personal Info----------");
		
		System.out.print("Name: ");
		System.out.println(a);
		System.out.print("Age: ");
		System.out.println(b);
		System.out.print("Email id: ");
		System.out.println(c);
		System.out.print("Address: ");
		System.out.println(d);
		System.out.print("Phone no: ");
		System.out.println(e);
	}
}
