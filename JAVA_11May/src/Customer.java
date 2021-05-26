
public class Customer 
{
	private String cName; 
	private String email;
	private int age;
	private double creditLimit;
	
	Customer()
	{
		cName = "Riya";
		email= "riya@gmail.com";
		age = 25;
		creditLimit = 10000;
		
		getDetails();
	}
	
	Customer(String cName, String email, int age, double creditLimit)
	{
		this.cName = cName;
		this.email= email;
		this.age = age;
		this.creditLimit = creditLimit; 
	}
	
	public void getDetails()
	{
		System.out.println("Customer Details");
		System.out.println("Name         : "+cName);
		System.out.println("Credit Limit : "+creditLimit);
		System.out.println("\n");
	}
	
	public String getcName() {
		return cName;
	}

	public double getCreditLimit()
	{
		return creditLimit;
	}
	
	public void setCreditLimit(double creditLimit)
	{
		this.creditLimit = creditLimit; 
	}
}
