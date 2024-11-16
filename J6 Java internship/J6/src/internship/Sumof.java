package internship;

public class Sumof {

	public static void main(String[] args) 
	{
		int n = 1474, sum = 0, rev;
		String revstr = " ";
		for(int i = n; i!=0; i /= 10)
		{
			int digit = i % 10;
			revstr += digit;
			sum += digit;
		}
		System.out.println("Sum of Digits: " + sum);
		
	}

}
