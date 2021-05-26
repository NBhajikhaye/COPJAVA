import java.util.Scanner;

//private class Calender {
public class Calender 
{
	private int day; 
	private int month;
	private int year;
	
	Calender()
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
		
		System.out.println("Date : "+day+"/"+month+"/"+year);
		System.out.println("\n");
	}
	
	Calender(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
		
		System.out.println("Date : "+day+"/"+month+"/"+year);
		System.out.println("\n");
	}
	
	//Getters and Setters
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
