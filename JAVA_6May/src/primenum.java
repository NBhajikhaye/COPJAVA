import java.util.Scanner;

public class primenum 
{

	public static void main(String[] args) 
	{
		int num, i, flag = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = sc.nextInt();

		for(i = 2; i <= num / 2; i++)
		{
			if(num % 2 == 0) 
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println(num+" is a Prime number");
		else
			System.out.println(num+" is NOT a Prime number");
	}

}
