import java.util.Scanner;

public class maxMin3Nums 
{

	public static void main(String[] args) 
	{
		int num1, num2, num3;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first nummber");
		num1 = sc.nextInt();
		
		System.out.println("Enter second nummber");
		num2 = sc.nextInt();
		
		System.out.println("Enter third nummber");
		num3 = sc.nextInt();
		
		//Maximum of 3 Numbers
		if(num1 > num2)
		{
			if(num1 > num3)
				System.out.println("Greatest number is "+num1);
			else
				System.out.println("Greatest number is "+num3);
		}
		else if(num2 > num1) 
		{
			if(num2 > num3)
				System.out.println("Greatest number is "+num2);
			else
				System.out.println("Greatest number is "+num3);		
		}
		
		
		//Minimum of 3 Numbers
		if(num1 < num2)
		{
			if(num1 < num3)
				System.out.println("Lowest number is "+num1);
			else
				System.out.println("Lowest number is "+num3);
		}
		else if(num2 < num1) 
		{
			if(num2 < num3)
				System.out.println("Lowest number is "+num2);
			else
				System.out.println("Lowest number is "+num3);		
		}
	}

}
