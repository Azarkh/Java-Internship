package internship;

import java.util.Scanner;

public class BinString {

	public static void main(String[] args) 
	{
		String binary;
		int decimal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Binary: ");
		binary = sc.next();
		
		for(int i = binary.length() - 1, j = 0; i >= 0; i--, j++)
		{
			char bit = binary.charAt(i);
			if(bit == '1')
			{
				decimal = (int) (decimal + Math.pow(2, j));
			}
		}
		
		System.out.print("decimal(" + binary +") = " + decimal);

	}

}
