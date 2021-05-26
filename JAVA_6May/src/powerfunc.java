import java.util.Scanner;

public class powerfunc 
{

	public static void main(String[] args) 
	{
		int base, expo, result;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base value");
		base = sc.nextInt();
		
		System.out.println("Enter the exponent value");
		expo = sc.nextInt();
		
		result = 1;
		
		while(i < expo) 
		{
			result = result * base ;
			i++;
		}
		System.out.println("The power of given "+ result);
	}

}
