
import java.util.Scanner;

public class AdditionfuncOverload 
{
	public static void add(int a, int b) {
		System.out.println("Addition of ( "+a+" + "+b+" ) = "+(a+b));
	}
	
	public static void add(int a, double b) {
		System.out.println("Addition of ( "+a+" + "+b+" ) = "+(a+b));
	}
	
	public static void add(double a, int b) {
		System.out.println("Addition of ( "+a+" + "+b+" ) = "+(a+b));
	}
	
	public static void add(double a, double b) {
		System.out.println("Addition of ( "+a+" + "+b+" ) = "+(a+b));
	}

	public static void main(String[] args) 
	{
		int num1, num2;
		double num3, num4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Addition of two numbers using Function Overloading");
		System.out.println("Enter two Intger Values");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		add(num1, num2);
		
		
		System.out.println("Enter two Floating Point Values");
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		add(num3, num4);
		
		add(num1, num3);
		
		add(num4,num2);
		sc.close();
	}

}
