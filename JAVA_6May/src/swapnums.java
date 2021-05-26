import java.util.Scanner;

public class swapnums 
{

	public static void main(String[] args) 
	{
		int num1, num2, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("First Number = "+num1+ "  Second Number ="+num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping");
		System.out.println("First Number = "+num1+ "  Second Number ="+num2);
	}

}
