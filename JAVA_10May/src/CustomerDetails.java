import java.util.Scanner;

public class CustomerDetails 
{
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	CustomerDetails()
	{
		this.name = "Riya";
		this.email = "riya@gmail.com";
		this.age = 25;
		this.creditLimit = 10000;
		showData();
	}
	
	CustomerDetails(String name1, String email1, int age1)
	{
		name = name1;
		email = email1;
		age = age1;
		
		showData();
	}
	
	Scanner sc = new Scanner(System.in);
	public void acceptData()
	{
		
		System.out.println("Enter the Customer Name");
		name = sc.nextLine();
		
		System.out.println("Enter the Customer Email");
		email = sc.nextLine();
		
		System.out.println("Enter the Customer age");
		age = sc.nextInt();
		
		System.out.println("Enter the Credit Limit");
		creditLimit = sc.nextDouble();
		
	
	}
	
	public void changeCreditLimit(double creditL)
	{
		creditLimit = creditL;
	}
	
	public void showData()
	{
		System.out.println("\n Customer Details");
		System.out.println(" Name          : "+name);
		System.out.println(" Credit Limit  : "+creditLimit);
		System.out.println("\n");
	}
	
	public void displayData()
	{
		System.out.println("\n Customer Details");
		System.out.println(" Name          : "+name);
		System.out.println(" Email         : "+email);
		System.out.println(" Age           : "+age);
		System.out.println(" Credit Limit  : "+creditLimit);
		System.out.println("\n");
	}
}
