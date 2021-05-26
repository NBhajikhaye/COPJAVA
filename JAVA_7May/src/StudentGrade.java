import java.util.Scanner;

public class StudentGrade 
{

	public static void main(String[] args) 
	{
		int rollno, sub1, sub2, sub3, sub4, sub5, percent, total;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student Information");
		System.out.println("Enter Student Roll Number");
		rollno = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Student Name");
		name = sc.nextLine();
		
		System.out.println("Enter the marks of Subject 1");
		sub1 = sc.nextInt();
		System.out.println("Enter the marks of Subject 2");
		sub2 = sc.nextInt();
		System.out.println("Enter the marks of Subject 3");
		sub3 = sc.nextInt();
		System.out.println("Enter the marks of Subject 4");
		sub4 = sc.nextInt();
		System.out.println("Enter the marks of Subject 5");
		sub5 = sc.nextInt();
		
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		percent = total / 5;
		
		System.out.println("Roll No. \t Name");
		System.out.println("\t"+rollno+"\t"+name);
		
		System.out.println("Marks\t Subject1\t   Subject2\t   Subject3\t Subject4\t Subject5");
		System.out.println("\t\t"+sub1+"\t\t"+sub2+"\t\t"+sub3+"\t\t"+sub4+"\t\t"+sub5);
		
		System.out.println("Total : \t "+total);
		System.out.println("Percentage : \t "+percent);
		
		if( percent > 75 )
			System.out.println("You have scored A Grade");
		else if( percent < 74 && percent > 60)
			System.out.println("You have scored B Grade");
		else if( percent < 59)
			System.out.println("You have scored C Grade");
		else
			System.out.println("Invalid Marks Entered");
		
		sc.close();
	}

}
