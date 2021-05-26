import java.util.Scanner;

public class Employee 
{
	private int empID;
	private String empName;
	private String empAddress;
	private double empSalary;
	
	public void acceptEmpInfo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Information");
		System.out.println("Enter Employee ID");
		empID = sc.nextInt();
		
		System.out.println("Enter Name");
		empName = sc.next();
		
		System.out.println("Enter Addresss");
		empAddress = sc.next();
		
		System.out.println("Enter Salary");
		empSalary = sc.nextDouble();
		System.out.println("\n");
	}
	
	public void displayEmpInfo()
	{
		
		System.out.println("Employee Information");
		System.out.println("ID       : "+empID);
		System.out.println("Name     : "+empName);
		System.out.println("Addresss : "+empAddress);
		System.out.println("Salary   : "+empSalary);

		System.out.println("---------------------------------------");
	}

	public double getEmpSalary() {
		return empSalary;
	}
}
