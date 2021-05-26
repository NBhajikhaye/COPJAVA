import java.util.Scanner;

public class RunCustomerDetails 
{ 
	public static void main(String[] args) 
	{
		String name, email;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the customer name");
		name = sc.nextLine();
		
		System.out.println("Enter the customer email");
		email = sc.nextLine();
		
		System.out.println("Enter the customer age");
		age = sc.nextInt();
		
		
		CustomerDetails cd1 = new CustomerDetails(name, email, age);
		CustomerDetails cd2 = new CustomerDetails();	
		
		int custnum; String ch;
		double creditL;
			
		System.out.println("Do you want to change Credit Limit (Y / N)");
		
		ch = sc.next();
	
		if(ch == "y");
		{
			System.out.println("Enter the Credit Limit");
			creditL = sc.nextDouble();
			
			do 
			{
				System.out.println("For which customer you want to change");
				custnum = sc.nextInt();
				
				if(custnum == 1)
				{
					cd1.changeCreditLimit(creditL);
					cd1.showData();
				}
				else if(custnum == 2)
				{
					cd2.changeCreditLimit(creditL);
					cd2.showData();
				}
				else
					System.out.println("Invalid Customer Number");
			}while(custnum > 2);
		}
		sc.close();
	}
}
//	public static void main(String[] args) 
//	{
//		int custnum; String ch;
//		double creditL;
//		CustomerDetails cd1 = new CustomerDetails();
//		CustomerDetails cd2 = new CustomerDetails();
//		
//		cd1.acceptData();
//		cd1.showData();
//		
//		cd2.acceptData();
//		cd2.showData();
//		
//		System.out.println("Do you want to change Credit Limit (Y / N)");
//		Scanner sc = new Scanner(System.in);
//		ch = sc.next();
//		
//		if(ch == "y");
//		{
//			System.out.println("Enter the Credit Limit");
//			creditL = sc.nextDouble();
//			
//			do 
//			{
//				System.out.println("For which customer you want to change");
//				custnum = sc.nextInt();
//				
//				if(custnum == 1)
//				{
//					cd1.changeCreditLimit(creditL);
//					cd1.showData();
//				}
//				else if(custnum == 2)
//				{
//					cd2.changeCreditLimit(creditL);
//					cd2.showData();
//				}
//				else
//					System.out.println("Invalid Customer Number");
//			}while(custnum > 2);
//		}
//		sc.close();
//	}
//}
	

