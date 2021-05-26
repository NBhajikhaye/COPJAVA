import java.util.Scanner;

public class numReverse 
{
	public static void main(String[] args) 
	{	
		int num, rem, rev;
		rem = rev = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to print reverse");
		num = sc.nextInt();
		
		while(num != 0) 
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse of given number = "+rev);
	}

}
