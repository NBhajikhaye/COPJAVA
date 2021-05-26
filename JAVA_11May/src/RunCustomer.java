import java.util.Scanner;

public class RunCustomer 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name, email, cl; int age, cnum; double creditL;
		
		System.out.println("Enter Customer Details");
		System.out.println("Enter Customer Name");
		name = sc.next();
		
		System.out.println("Enter Email");
		email = sc.next();
		
		System.out.println("Enter Age");
		age = sc.nextInt();
		
		System.out.println("Enter Credit Limit");
		creditL = sc.nextDouble();
		
		Customer c1 = new Customer(name, email, age, creditL);
		c1.getDetails();
		
		
		Customer c2 = new Customer();
		
		System.out.println("Do You want to change Credit Limit (Y / N)");
		cl = sc.next();
		
		if(cl.charAt(0) == 'Y' || cl.charAt(0) == 'y')
		{
			System.out.println("Enter Credit Limit");
			creditL = sc.nextDouble();
			
			c2.setCreditLimit(creditL);
		}
		
		System.out.println("Customer Details");
		System.out.println("Name         : "+c2.getcName());
		System.out.println("Credit Limit : "+c2.getCreditLimit());
		System.out.println("\n");
	}

}




/*do 
{
System.out.println("Enter the number of customer you want to change credit limit of");
cnum = sc.nextInt();

if(cnum > 2)
	System.out.println("Invalid Customer Number");

}while(cnum > 2);
*/