import java.util.Scanner;

public class GrossSalary 
{
	public static void main(String[] args) 
	{
		double bsal, gsal, da, hra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Basic Salary to calculate Gross Salary");
		bsal = sc.nextDouble();
		
		if(bsal <= 10000)
		{
			da = bsal *  80 / 100 ;
			hra = bsal *  20 / 100 ;
			gsal = bsal + da + hra;
		}
		else if(bsal <= 20000)
		{
			da = bsal *  90 / 100 ;
			hra = bsal *  25 / 100 ;
			gsal = bsal + da + hra;
		}
		else
		{
			da = bsal *  95 / 100 ;
			hra = bsal *  30 / 100 ;
			gsal = bsal + da + hra;
		}
		System.out.println("Gross Salary is "+gsal);
		sc.close();
	}
}
