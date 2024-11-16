package internship;

import java.util.*;
public class Fib
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("n: ");
		n = sc.nextInt();
		System.out.print("Series: ");
		
		if(n == 1)
		{
			System.out.print("0");
		}
		else if(n == 2)
		{
			System.out.print("0 1");
		}
		else
		{
			int a = 0, b = 1;
			System.out.print(a + " " + b);
			
			for(int i = 3; i <= n; i++)
			{
				int c = a+b;
				System.out.print(" " + c);
				a = b;
				b = c;
			}
		}

	}

}