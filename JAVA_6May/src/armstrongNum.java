import java.util.Scanner;

public class armstrongNum {
	public static void main(String[] args) {
		int number, rem, sum, temp;
		rem = sum = temp = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to check if armstrong or not");
		number = sc.nextInt();

		temp = number;
		while (temp != 0) 
		{
			rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
		}
		
		if (sum == number)
			System.out.println(number+" is an Armstrong number");
		else
			System.out.println(number +" is NOT an Armstrong number");
	}
}
