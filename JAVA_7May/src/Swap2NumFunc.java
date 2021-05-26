import java.util.Scanner;

public class Swap2NumFunc
{
	public static void swap(int num1, int num2)
	{
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping");
		System.out.println("First Number : "+num1+"\t Second Number : "+num2);
	}
	
	public static void main(String[] args)
	{
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Swapping of two numbers");
		System.out.println("Enter the First Number");
		num1 = sc.nextInt();
		
		System.out.println("Enter the Second Number");
		num2 = sc.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("First Number : "+num1+"\t Second Number : "+num2);
		
		swap(num1, num2);
		sc.close();
	}

}
