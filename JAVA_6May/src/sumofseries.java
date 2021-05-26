import java.util.Scanner;

public class sumofseries 
{

	public static void main(String[] args) 
	{
		int num, i, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to print series till the number");
		num = sc.nextInt();
		
		for(i = 0; i <= num; i++)
			sum = sum + i;
		
		System.out.println(sum);
	}

}
