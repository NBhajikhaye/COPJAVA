import java.util.Scanner;

public class sumofoddeven 
{

	public static void main(String[] args) 
	{
		int num, i, j, sum1, sum2;
		sum1 = sum2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		for(i = 1; i <= num;)
		{	sum1 = sum1 + i;
			i = i + 2;
		}
		
		for(j = 2; j <= num;) 
		{
			sum2 = sum2 + j;
			j = j + 2;
		}
		
		System.out.println("Sum of ODD Numbers = "+sum1);
		System.out.println("Sum of EVEN Numbers = "+sum2);

	}

}
