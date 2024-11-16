package internship;

import java.util.Scanner;
import java.lang.String;
public class Decimal 
{
	public static void main(String [] args)
	{
			int i;
			String rev = "" , bin = "";
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Decimal Number : ");
			int n = sc.nextInt();
			
			for(i=n ; i>0; i/=2)
			{
				int a = i%2;
				rev += a;
			}
			
			for(i = rev.length()-1; i>=0; i--)
			{
				bin = bin + rev.charAt(i);
			}
			
			System.out.print("Binary = ");
			System.out.println(bin);
			
			String oct = "" , revoct = "";
			
			for(i=n ; i>0; i/=8)
			{
				int b = i%8;
				revoct += b;
			}
			
			for(i = revoct.length()-1; i>=0; i--)
			{
				oct = oct + revoct.charAt(i);
			}
			
			System.out.print("Octal = ");
			System.out.print(oct);
	}

}
