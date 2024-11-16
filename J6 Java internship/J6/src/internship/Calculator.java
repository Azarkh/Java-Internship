package internship;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Calculator-----");
		
		while(true)
		{
			System.out.println("---Menu---");
			System.out.println("1) + ");
			System.out.println("2) - ");
			System.out.println("3) * ");
			System.out.println("4) / ");
			System.out.println("5) ^ ");
			System.out.println("6) sqrt() ");
			System.out.println("0) exit ");
			System.out.println("Enter Your Choice: ");
			ch = sc.nextInt();
			
			if(ch == 0) //Exit condition
			{
				System.out.println("Thank You");
				break;
			}
			
			else if(ch == 1)
			{
				System.out.print("a + b\na: ");
				int a = sc.nextInt();
				System.out.print("b: ");
				int b = sc.nextInt();
				System.out.println(a + " + " + b + " = " + (a+b));
			}
			
			else if(ch == 2)
			{
				System.out.print("a - b\na: ");
				int a = sc.nextInt();
				System.out.print("b: ");
				int b = sc.nextInt();
				System.out.println(a + " - " + b + " = " + (a-b));
			}
			
			else if(ch == 3)
			{
				System.out.print("a * b\na: ");
				int a = sc.nextInt();
				System.out.print("b: ");
				int b = sc.nextInt();
				System.out.println(a + " * " + b + " = " + (a*b));
			}
			
			else if(ch == 4)
			{
				System.out.print("a / b\na: ");
				int a = sc.nextInt();
				System.out.print("b: ");
				int b = sc.nextInt();
				System.out.println(a + " / " + b + " = " + (a/b));
			}
			
			else if(ch == 5)
			{
				System.out.print("a^\na: ");
				int a = sc.nextInt();
				System.out.print("b: ");
				int b = sc.nextInt();
				System.out.println(a + "^ " + " = " + (Math.pow(a,b)));
			}
			
			else if(ch == 6)
			{
				System.out.print("a Sqrt()\na: ");
				int a = sc.nextInt();
				System.out.println(a + " Sqrt()" + " = " + (Math.sqrt(a)));
			}
		}

	}

}
