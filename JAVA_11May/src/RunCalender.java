import java.util.Scanner;

public class RunCalender 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int day, month, year;
		System.out.println("Enter Date (DD/MM/YYYY)");
		System.out.println("Enter Day");
		day = sc.nextInt();
		
		System.out.println("Enter Month");
		month = sc.nextInt();
		
		System.out.println("Enter year");
		year = sc.nextInt();
		
		Calender c1 = new Calender();
		
		c1.setDay(day);
		c1.setMonth(month);
		c1.setYear(year);
		
		System.out.println("Date : "+c1.getDay()+"/"+c1.getMonth()+"/"+c1.getYear());
		System.out.println("\n");
		
		Calender c2 = new Calender();
		Calender c3 = new Calender(25,9,2000);
	}
}
