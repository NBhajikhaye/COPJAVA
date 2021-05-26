import java.util.Scanner;

public class prime1ton 
{
	public static void main(String[] args) 
	{
		int num, i, j, flag;
		flag = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to which print prime number");
		num = sc.nextInt();
		
		for(i = 2; i <= num; i++)
		{
			for(j = 2; j <= i / 2; j++)
			{
				if(i % j == 0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				System.out.println(i);
			
			flag = 0;
		}
	}

}
