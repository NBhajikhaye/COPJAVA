import java.util.Scanner;

public class factorial 
{

	public static void main(String[] args) 
	{
		int num, fact = 1;
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial");
		num = sc.nextInt();
		
		while(i <= num)
		{
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of "+num+" = "+fact);
	}

}
