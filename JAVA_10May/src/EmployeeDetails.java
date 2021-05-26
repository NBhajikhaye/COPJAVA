import java.util.Scanner;

public class EmployeeDetails 
{
	private int id;
	private String name;
	private double bsal;
	private double hra;
	private final double medical = 500;
	private double pf;
	private final double pt = 200;
	private double netSal;
	private double gsal;
	
	Scanner sc = new Scanner(System.in);
	
	public void acceprEmpData()
	{
		System.out.println("Enter Employee ID");
		id = sc.nextInt();
		
		System.out.println("Enter Employee Name");
		name = sc.next();
		
		System.out.println("Enter Basic Salary of Employee");
		bsal = sc.nextDouble();
		
		sc.close();
		
		calculateGrossSal();
	}
	
	public void calculateGrossSal()
	{
		hra = bsal * 50 / 100 ;
		pf = bsal * 12 / 100;
		gsal = bsal + hra + medical;
		netSal = gsal - (pt + pf);
	}
	
	public void displayEmpData()
	{
		System.out.println("Employee Details");
		System.out.println("ID            : "+id);
		System.out.println("Name          : "+name);
		System.out.println("Basic Salary  : "+bsal);
		System.out.println("Gross Salary  : "+gsal);
		System.out.println("Net Salary    : "+netSal);
	}
}
