package internship;

import java.util.Scanner;
public class ArrayOp {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int ch;
		
		System.out.print("Enter Array Size: ");
		int n = sc.nextInt();
		
		int [] a = new int[n];
		
		System.out.print("Enter Array Elements: ");
		for(int i = 0; i < n; i++) 
		{
			a[i] = sc.nextInt();
		}
		
		while(true)
		{
			System.out.println("-----Menu-----");
			System.out.println("1) Length ");
			System.out.println("2) Print ");
			System.out.println("3) Merge ");
			System.out.println("4) Sum & Average ");
			System.out.println("5) Sum Pairs ");
			System.out.println("6) Right Shift ");
			System.out.println("0) Exit ");
			
			System.out.print("Choice : ");
			ch = sc.nextInt();
			
			if(ch == 0)
			{
				break;
			}
			
			else if(ch == 1)
			{
				System.out.println("Length : " + a.length);
			}
			
			else if(ch == 2)
			{
				System.out.println("Printing Array : ");
				for(int i = 0; i < a.length; i++)
				{
					System.out.println(a[i]);
				}
			}
			
			else if(ch == 3)
			{
				System.out.print("Enter New Array Size: ");
				int m = sc.nextInt();
				int [] b = new int[m];
				System.out.print("Enter New Array Elements: ");
				for(int i = 0; i < m; i++) 
				{
					b[i] = sc.nextInt();
				}
				
				int [] marr = new int[n+m];
				for(int i = 0; i < n; i++) 
				{
					
				}
				for(int i = 0; i < m; i++) 
				{
					b[i] = sc.nextInt();
				}
			}
			
			else if(ch == 4)
			{
				System.out.println("Length : " + a.length);
			}
			
			else if(ch == 5)
			{
				System.out.println("Length : " + a.length);
			}
			
			else if(ch == 6)
			{
				System.out.println("Length : " + a.length);
			}
			
			
		}
	}

}
