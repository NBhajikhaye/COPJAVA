import java.util.Scanner;

public class addition
{

	public static void main(String[] args) 
	{
		//Addition of two numbers
		int num1, num2, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		
		result = num1 + num2;
		
		System.out.println("Addition of "+num1+" and "+num2+" = "+result);
		
		
		
		//Addition of two characters
		String s1, s2;
		
		System.out.println("Enter the first String");
		s1 = sc.next();
		
		System.out.println("Enter the second String");
		s2 = sc.next();
		
		System.out.println("After Concatenantion = "+s1+" "+s2);

	}

}
