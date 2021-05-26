import java.util.Scanner;

public class Calender 
{
	private int day, year;
	private String month;
	
	public void accpetData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calender");
		
		System.out.println("Enter the Date the month (Ex. 9 June)");
		day = sc.nextInt();
		month = sc.next();
		
		System.out.println("Enter the Year");
		year = sc.nextInt();
		
		sc.close();
	}
	
	public void displayData()
	{
		System.out.println("Data Entered");
		System.out.println("Day \t Month \t\t Year");
		System.out.println(day+"\t"+month+"\t"+year);
	}
}